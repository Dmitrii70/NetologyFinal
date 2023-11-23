package JavaCore.Chapter3.Webinar;

import java.io.*;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("War and Peace", "Tolstoy", 1000);
        book.realPrice = 100;
        System.out.println(book);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.dat"))) {
            oos.writeObject(book);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Book book1 = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.dat"))) {
        book1 = (Book) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(book1);
    }
}
