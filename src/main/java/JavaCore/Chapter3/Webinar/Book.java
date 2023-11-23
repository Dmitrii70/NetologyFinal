package JavaCore.Chapter3.Webinar;

import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 1232;

    public transient int realPrice;
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Book(String title, String author, int price, int realPrice) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.realPrice = realPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
