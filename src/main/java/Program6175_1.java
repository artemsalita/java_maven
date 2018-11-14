import java.io.File;
import java.util.Scanner;

public class Program6175_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.nextLine();
        String filename = "resourses/task6175/test"+ A +".txt";
        File file = new File(filename);

        try {
            Scanner d = new Scanner(file);

                String line = d.nextLine();
                System.out.print(line);

                while (d.hasNext()){
                    line = d.nextLine();
                    System.out.print(", " + line);
                }

        } catch (java.io.FileNotFoundException ex) {
            System.out.println("Файл не существует " + file.getAbsolutePath());
        }
            catch (java.util.NoSuchElementException exx){
                System.out.println("Файл пуст " + file.getAbsolutePath());
            }

    }
}