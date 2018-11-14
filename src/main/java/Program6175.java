import java.io.File;
import java.util.Scanner;

public class Program6175 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.nextLine();
        String filename = "resourses/task6175/test"+ A +".txt";
        File file = new File(filename);

        try {
            Scanner d = new Scanner(file);
            if (d.hasNext()){


           String line = d.nextLine();
            System.out.print(line);



            while (d.hasNext()){
                line = d.nextLine();
                System.out.print(", " + line);
            }} else {
                System.out.println("Файл пуст");
            }


        } catch (java.io.FileNotFoundException ex) {
            System.out.println("Файл не существует" + file.getAbsolutePath());

        }
    }
}