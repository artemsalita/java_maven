import java.util.Scanner;

public class Task1439 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        String Chars = s.nextLine();

        //String[] chars = Chars.split("");
        int A = 0;
        double B = 0, C;
        String[] amountsNum = Chars.split(" ");
        int[] amounts = new int[amountsNum.length];
        for (int i = 0; i < amountsNum.length; i++) {

            try {
                amounts[i] = Integer.parseInt(amountsNum[i]);

                A = A + amounts[i];
                B ++;

            } catch (NumberFormatException zw) {

                System.out.println("Элемент " + i + " со значением " + amountsNum[i] + " не число");
            }
        }

       for (int g = 0; g < amounts.length; g++) {


            //System.out.print(amounts[g]);
        }
        C = A/B;
        System.out.println(C);

    }
}