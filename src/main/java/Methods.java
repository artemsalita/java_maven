public class Methods {
    //В классе Methods реализуйте публичный статический метод task1860.
   public static void task1860(String x){//Он принимает в качестве аргумента 1 строку.

      System.out.println("Мы стремимся к "+x);
   }

    public static void task4140(String firstName,String lastName) {
        System.out.println("Меня зовут "+lastName+", "+firstName+" "+lastName);
    }

    public static void task2632(String cx, String cy, String r, String fill) {
        System.out.println("<"+"circle cx="+"\""+cx+"\""+" "+"cy="+"\""+cy+"\""+" "+"r="+"\""+r+"\""+" "+"fill="+"\""+fill+"\""+"/"+">");

    }

    public static void task7474(String a, String b, String c) {
        System.out.println("Квадратное уравнение "+a+"*x*x + "+b+"*x + "+c+" = 0.\n" +
                           "Его дискриминант вычисляется по формуле: d = "+b+"*"+b+" - 4*"+a+"*"+c+"");
    }

    public static double task4411(double x){
       double result = x + 7;
       return result;
    }

    public static double task2790(double a) {
        // aRad=aDeg*π/180
        double d = a * Math.PI / 180;
        double result = Math.sqrt(1 - Math.sin(d) * Math.sin(d));
        return result;
    }


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
