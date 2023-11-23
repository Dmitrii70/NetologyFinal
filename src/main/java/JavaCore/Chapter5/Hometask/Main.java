//package JavaCore.Chapter5.Hometask;
//
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//
//        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
//        String fileName = "data.csv";
//        String[] employee1 = "1,John, Smith, USA, 25".split(",");
//        String[] employee2 = "2,Ivan,Petrov, Russia,23".split(",");
//        try (CSVWriter writer = new CSVWriter(FileWriter(fileName))) {
//// Записываем экземпляр CSVWriter
//            writer.writeNexy(employee1);
//            writer.writeNext(employee2);
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        List<Employee> list = parseCSV(columnMapping, fileName);
//
//    }
//
//    public String[] parseCSV(String[] columnMapping, String filename) {
//        try (CSVReader reader = new CSVReader (new FileReader(filename))){
//            String[] nextLine;
//            while ((nextLine = reader.readNext()) != null) {
//                System.out.println(Arrays.toString(nextLine));
//            }
//        } catch (IOException | CsvValidationException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
