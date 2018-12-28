public class Homework_1 {

    public static void main(String[] args) {

       String[] a,b;

        a = new String [5];
        b = new String [6];

        a[0]= "a";
        a[1]= "b";
        a[2]= "c";
        a[3]= "d";
        a[4]= "e";


        String z = "Z";

        for (int x = 0; x < a.length;x++) {
            b[x] = a[x];
            System.out.print(b[x]);
        }

        b[5] = z;
        System.out.print(b[5]);

    }
}
