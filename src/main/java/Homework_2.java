public class Homework_2 {

    public static void main(String[] args) {

        String[] a,b;
        int g = 4;

        a = new String [6];
        b = new String [7];

        a[0]= "a";
        a[1]= "b";
        a[2]= "c";
        a[3]= "d";
        a[4]= "e";
        a[5]= "f";

        String z = "z";

        for (int x = 0, c = 0; x < b.length;x++,c++) {
            b[x] = a[c];

            if (x == g){
                b[g] = z;
                c = c-1;


            }
            System.out.print(b[x]);
        }


    }
}
