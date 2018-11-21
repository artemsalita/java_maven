import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by adm on 21.11.2018.
 */
public class Programm4488_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.nextLine();
        String filename = "resourses/task4488/test"+ A +".txt";
        File file = new File(filename);
        int D = 0;

        try {
            Scanner d = new Scanner(file);

            String line = d.nextLine();
            System.out.println(line);

            D = work(d);

        } catch (java.io.FileNotFoundException ex) {
            System.out.println("Файл не существует " + file.getAbsolutePath());
        }
        catch (java.util.NoSuchElementException exx){
            System.out.println("Файл пуст " + file.getAbsolutePath());
        }

        System.out.println(D);

    }
    public static int work (Scanner s){

       // System.out.println(line);
        int S = 0;

        while (s.hasNext()){

            String line = s.nextLine();
            S++;
        }return S;
    }
}
