import java.io.File;
import java.util.Scanner;

/**
 * Created by adm on 21.11.2018.
 */
public class Programm4954 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.nextLine();
        String filename = "resourses/task4954/test"+ A +".txt";
        File file = new File(filename);
        int D = 0;

        try {
            String B = s.nextLine();
            Scanner d = new Scanner(file);

            while (d.hasNext()){

                String line = d.nextLine();
                if (line.contains(B)){
                    D++;
                }

            }


        } catch (java.io.FileNotFoundException ex) {
            System.out.println("Файл не существует " + file.getAbsolutePath());
        }
        catch (java.util.NoSuchElementException exx){
            System.out.println("Файл пуст " + file.getAbsolutePath());
        }

        System.out.println(D);

    }

    }

