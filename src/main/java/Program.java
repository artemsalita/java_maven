import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
       // В методе main класса Program 3 раза вызовите метод task1860 класса Methods.
        //task1
//        Methods.task1860("знаниям");
//        Methods.task1860("цели");
//        Methods.task1860("результату");
//
        //task2
//        Methods.task4140("Джеймс","Бонд");
//        Methods.task4140("капитан","Джек Воробей");
//        Methods.task4140("Александр","Крюков");
//
        //task3
//        Methods.task2632("50","50","40","yellow");
//        Methods.task2632("400","300","200","green");
//        Methods.task2632("254","356","100","#cc6600");
//
        //task4
//        Methods.task7474("1","2","3");
//        System.out.println();
//        Methods.task7474("-3","0","2");

        //task5
//        double a;
//        a = Methods.task4411(5);
//        System.out.println(a);

        //task6
//        double a;
//        a = Methods.task2790(31);
//        System.out.println(a);

        //task7
//        String result;
//        result = Methods.task5662(0,2,3);
//        System.out.println(result);

        //task8
//        double c;
//        c =  Methods.task3669(8,13);
//        System.out.println(c);

        //task9
       // String X = Methods.task1292();
       // System.out.println(X);

       // double X = Methods.task9020(0);
        //System.out.println(X);

//      try  {
//          Scanner s = new Scanner(System.in);
//          int X  = s.nextInt();
//          double Z = Methods.task9020(X);
//          System.out.println(Z);
//
//      }catch (IllegalArgumentException MM){
//          String description =  MM.getMessage();
//          System.out.println(description);;
//        }
       // System.out.println(Z);
//        Step3();
//        System.out.println("после step3");

        try {
            Step4();
            System.out.println("после step4");//не должно выполнится

        } catch (IllegalArgumentException ex){
            String description = ex.getMessage();
            System.out.println(description);
        }
    }


    public static void Step4(){
        double A = Methods.task9020(50);
        System.out.println(A);
        System.out.println("Конец Step4");
    }



    public  static  void Step3(){

        try {
            double A = Methods.task9020(99);
            System.out.println(A);
            System.out.println("Конец Step3");
        }catch (IllegalArgumentException ex){
            String description = ex.getMessage();
            System.out.println(description);
        }
    }




}
