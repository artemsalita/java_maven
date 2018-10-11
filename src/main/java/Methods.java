public class Methods {
    //В классе Methods реализуйте публичный статический метод task1860.
    //task1
   public static void task1860(String x){//Он принимает в качестве аргумента 1 строку.

      System.out.println("Мы стремимся к "+x);
   }

   //task2
    public static void task4140(String firstName,String lastName) {
        System.out.println("Меня зовут "+lastName+", "+firstName+" "+lastName);
    }

    //task3
    public static void task2632(String cx, String cy, String r, String fill) {
        System.out.println("<"+"circle cx="+"\""+cx+"\""+" "+"cy="+"\""+cy+"\""+" "+"r="+"\""+r+"\""+" "+"fill="+"\""+fill+"\""+"/"+">");

    }

    //task4
    public static void task7474(String a, String b, String c) {
        System.out.println("Квадратное уравнение "+a+"*x*x + "+b+"*x + "+c+" = 0.\n" +
                           "Его дискриминант вычисляется по формуле: d = "+b+"*"+b+" - 4*"+a+"*"+c+"");
    }


    //task5
    public static double task4411(double x){
       double result = x + 7;
       return result;
    }


    //task6
    public static double task2790(double a) {
        // aRad=aDeg*π/180
        double d = a * Math.PI / 180;
        double result = Math.sqrt(1 - Math.sin(d) * Math.sin(d));
        return result;
    }

    //task7
    public static String task5662 (double a, double b, double c){

       double D = b*b-4*a*c;

       String Q = "Вещественных корней уравнения нет";
       String W = "Уравнение имеет один корень";
       String E = "У уравнения два вещественных корня";
       String R = "Данное уравнение не является квадратным";
       String result = "end";

       if (a ==0){return R;}
       if (D<0) {return Q;}
       if (D == 0){return W;}
       if (D>0) {return E;}

        return result;
    }

    //task8
public static  int task3669 (int a,int b) {

    int z = 0;

    if (a < b) {
        z = a + 1;
        while (z <= b) {
            a = a * z;
            z++;
        }   // return c;

    }

    if (b < a) {
        z = b + 1;
        while (z <= a) {
            b = b * z;
            z++;
            //return c;
        }
    }
return z;
}

        //task9
    public static String task1292 (String X) {

        String[] a;
        a = new String[]{"a", "b", "c", "d", "e", "f", "g", "h"};

        for (int i = 0; i < a.length; i++) {

           // System.out.print(a[i]);

            if (a[i].equals(X)) {
                //System.out.println();

            }
        }return X;
    }




    //task10
    public static double task3946(int[] arr){

        double average;
        double sum = 0;

        if (arr.length == 0){
            return 0;
        }

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }
        average = sum / arr.length;
        //System.out.println(average);
        return average;





    }
}
