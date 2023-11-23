package JavaCore.Chapter3.Webinar;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File dir = new File("C:/Users/Dmitrii/IdeaProjects/Netology/directory/subdirectory2");
        dir.mkdirs();
        File file = new File("directory/subdirectory", "example1.txt");
//        File file1 = new File("directory/subdirectory", "example2.txt");
//        try {
//            file1.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println(Arrays.toString(dir.list()));
        System.out.println(dir.exists());
        System.out.println(file.getName());
    }
}
