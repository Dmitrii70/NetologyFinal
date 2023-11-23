package JavaCore.Chapter3.Webinar;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class MainPotoki {
    public static void main(String[] args) {
        String text = "Hello, World!\nПривет, Мир!";
        byte[] buffer = text.getBytes();
//        try (FileOutputStream fos = new FileOutputStream("notes.txt")) {
//            byte[] bytes = text.getBytes();
//            fos.write(bytes, 0, bytes.length);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try (FileInputStream fis = new FileInputStream("notes.txt")) {
//            while (fis.available() > 0) {
//                System.out.print((char) fis.read());
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try (FileOutputStream fos = new FileOutputStream("notes2.txt");
//             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
//            bos.write(buffer);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        try (FileInputStream fis = new FileInputStream("notes2.txt");
//             BufferedInputStream bis = new BufferedInputStream(fis)) {
//            while (bis.available() > 0) {
//                System.out.print((char) fis.read());
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try (FileWriter writer = new FileWriter("notes3.txt")) {
//            writer.write(text);
//            writer.append("\n");
//            writer.append(text);
//            writer.flush();
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        try (FileReader reader = new FileReader("notes3.txt", StandardCharsets.UTF_8)) {
//            int i;
//            while ((i = reader.read()) != -1) {
//                System.out.print((char) i);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("notes4.txt"))) {
//            bufferedWriter.write(text);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("notes4.txt"))) {
//            String s;
//            while ((s = bufferedReader.readLine()) != null) {
//                System.out.println(s);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("archive.zip"))) {
//            File directory = new File("files");
//            for (File file : directory.listFiles()) {
//                System.out.println(file);
//                FileInputStream fis = new FileInputStream(file);
//                byte[] bytes = new byte[fis.available()];
//                fis.read(bytes);
//                fis.close();
//
//                ZipEntry entry = new ZipEntry("!" + file.getName());
//                zout.putNextEntry(entry);
//                zout.write(bytes);
//                zout.closeEntry();
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try (ZipInputStream zis = new ZipInputStream(new FileInputStream("archive.zip"))) {
            ZipEntry entry;
            String fileName;
            while ((entry = zis.getNextEntry()) != null) {
                fileName = entry.getName();
                
                FileOutputStream fout = new FileOutputStream("files2/" + fileName);
                for (int s = zis.read(); s != -1; s = zis.read()) {
                    fout.write(s);
                }
                fout.flush();
                zis.closeEntry();
                fout.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
