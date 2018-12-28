import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Homework_3 {

    public static void main(String[] args) {

        int[] Z = new int[5];
        int[] A = new int[5];


        Z[0] = 2;
        Z[1] = 6;
        Z[2] = 8;
        Z[3] = -5;
        Z[4] = -7;


        int i=0;
        int j=1;

        Arrays.sort(Z);

        Integer[] array = {9,-2,10,3,-5,34,-22,7};

        Arrays.sort(Z);
        System.out.println(Arrays.toString(Z));

        for (int h = 0; h < A.length; h++) {
            A[h] = Math.abs(Z[h]);
        }

        Arrays.sort(A);

        for (int h = 0; h < A.length; h++) {
            System.out.println(A[h]);
        }


    }
}
