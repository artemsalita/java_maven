package zadachi;

public class cycle {
    public static void main(String[] args){
        int i = 0;
        while(i <= 100){

            if (i == 3){
                i = 50;
                System.out.println("50");
            }

            i++;
            System.out.println(i);

        }

        System.out.println("100");
    }
}
