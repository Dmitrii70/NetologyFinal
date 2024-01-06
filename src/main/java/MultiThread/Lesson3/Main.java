package MultiThread.Lesson3;

import java.util.Random;

import static MultiThread.Lesson3.Utils.*;


public class Main {
    public static void main(String[] args) throws InterruptedException{
        Random random = new Random();
        String[] texts = new String[100_000];
        for (int i = 0; i < texts.length; i++) {
            texts[i] = generateText("abc", 3 + random.nextInt(3));
        }

        Thread palindrome = new Thread(() -> {
            for (String text : texts) {
                if (isPalindrome(text) && !isSameChair(text)) {
                    incrementCounter(text.length());
                }
            }
        });
        palindrome.start();

        Thread someChar = new Thread(() -> {
            for (String text : texts) {
                if (isSameChair(text)) {
                    incrementCounter(texts.length);
                }
            }
        });
        someChar.start();

        Thread ascendingOrder = new Thread(() -> {
            for (String text : texts) {
                if (!isSameChair(text) && isAscendingOrder(text)) {
                    incrementCounter(texts.length);
                }
            }
        });
        ascendingOrder.start();

        someChar.join();
        ascendingOrder.join();
        palindrome.join();

        System.out.println("Красивых слов с длиной 3: " + counter3);
        System.out.println("Красивых слов с длиной 4: " + counter4);
        System.out.println("Красивых слов с длиной 5: " + counter5);


    }
}
