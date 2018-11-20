import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Programm4488 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.nextLine();
        String filename = "resourses/task4488/test"+ A +".txt";
        File file = new File(filename);
        ArrayList<String> lines = new ArrayList<String>();

        try {
            Scanner d = new Scanner(file);

            String line = d.nextLine();
           System.out.println(line);

            while (d.hasNext()){
                line = d.nextLine();
                lines.add(line);
                //System.out.print(", " + line);
            }

        } catch (java.io.FileNotFoundException ex) {
            System.out.println("Файл не существует " + file.getAbsolutePath());
        }
        catch (java.util.NoSuchElementException exx){
            System.out.println("Файл пуст " + file.getAbsolutePath());
        }

        System.out.println(lines.size());

    }
}
