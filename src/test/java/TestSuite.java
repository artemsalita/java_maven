import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class TestSuite {
    @Test //task5
    public void task4411test() {
        double q = Methods.task4411(11.13);
        double w = Methods.task4411(-7919);
        double e = Methods.task4411(0);
        Assert.assertEquals(18.13, q, 0.001);
        Assert.assertEquals(-7912, w, 0.001);
        Assert.assertEquals(7, e, 0.001);
    }

    @Test //task6
    public void task2790test() {
        double q = Methods.task2790(31);
        double w = Methods.task2790(90);
        double e = Methods.task2790(0);
        Assert.assertEquals(0.8572, q, 0.001);
        Assert.assertEquals(0.0, w, 0.001);
        Assert.assertEquals(1.0, e, 0.001);
    }

    @Test //task7
    public void task5662test() {
        String z = Methods.task5662(1, 2, 3);
        String z1 = Methods.task5662(11, 13, 19);
        String z2 = Methods.task5662(3, 17, 5);
        String z3 = Methods.task5662(5, 31, 29);
        String z4 = Methods.task5662(3, 6, 3);
        String z5 = Methods.task5662(0, 7, 13);

        Assert.assertEquals("Вещественных корней уравнения нет", z);
        Assert.assertEquals("Вещественных корней уравнения нет", z1);
        Assert.assertEquals("У уравнения два вещественных корня", z2);
        Assert.assertEquals("У уравнения два вещественных корня", z3);
        Assert.assertEquals("Уравнение имеет один корень", z4);
        Assert.assertEquals("Данное уравнение не является квадратным", z5);
    }

    @Test//task8
    public void task3669test(){
        long z1 = Methods.task3669(8,13);
        long z2 = Methods.task3669(159,161);
        long z3 = Methods.task3669(13,8);
        long z4 = Methods.task3669(35,24);
        long z5 = Methods.task3669(648,648);
        long z6 = Methods.task3669(-2,600);

        Assert.assertEquals(1235520,z1,0.00001);
        Assert.assertEquals(4095840,z2,0.00001);
        Assert.assertEquals(1235520,z3,0.00001);
        Assert.assertEquals(399703747322880000L,z4,0.00001);
        Assert.assertEquals(648,z5,0.00001);
        Assert.assertEquals(0,z6,0.00001);
    }

    //task9
    @Test
    public void task1292test(){



        Assert.assertEquals("a",Methods.task1292("a"));
        Assert.assertEquals("ab",Methods.task1292("b"));
        Assert.assertEquals("abcd",Methods.task1292("d"));
        Assert.assertEquals("abcdefgh",Methods.task1292("h"));
        Assert.assertEquals("abcdefgh",Methods.task1292("i"));

    }


    @Test //task10
    public void task3946test() {
        int[] arr = new int[]{1, 2, 3, 4, 1};
        int[] arr2 = new int[]{1, 2, 3, 4, 1, 3, 4, 4, 4, 4};
        int[] arr3 = new int[]{};
        double qs = Methods.task3946(arr3);
        double qe = Methods.task3946(arr2);
        double qw = Methods.task3946(arr);
        Assert.assertEquals(2.2, qw, 0.0001);
        Assert.assertEquals(3, qe, 0.0001);
        Assert.assertEquals(0, qs, 0.0001);
    }
@Test //task13
    public void test9774test() {
    double[] data1 = new double[]{9 ,8 ,7, 6, 5, 4};
    double [] result1 = new double[]{279, 248 ,217, 186 ,155, 124};
    Methods.task9774(31,data1);
    Assert.assertArrayEquals(result1, data1, 0.0001);

    double[] data2 = new double[]{9 ,8 ,7, 6, 5, 4};
    double [] result2 = new double[]{-27, -24, -21 ,-18 ,-15, -12};
    Methods.task9774(-3,data2);
    Assert.assertArrayEquals(result2, data2, 0.0001);

    double[] data3 = new double[]{98 ,76, 54};
    double [] result3 = new double[]{1078,836,594};
    Methods.task9774(11,data3);
    Assert.assertArrayEquals(result3, data3, 0.0001);

    double[] data4 = new double[]{};
    double [] result4 = new double[]{};
    Methods.task9774(73,data4);
    Assert.assertArrayEquals(result4, data4, 0.0001);
}

@Test //task14
    public void task9271test(){
    double[]data1 = new double[]{5 ,4 ,6 ,2 ,3 ,1};
    double[] result1 = new double[]{4 ,3 ,5, 1, 2 ,0};
    Methods.task9271(data1);
    Assert.assertArrayEquals(data1,result1,0.0001);

    double[]data2 = new double[]{1 ,2 ,3 ,4 ,1 ,2};
    double[] result2 = new double[]{0, 1, 2,3 ,0, 1};
    Methods.task9271(data2);
    Assert.assertArrayEquals(data2,result2,0.0001);

    double[]data3 = new double[]{3 ,4, 1, 2 ,3, 4, 1, 2 ,3,1 ,2};
    double[] result3 = new double[]{2 ,3, 0, 1, 2 ,3 ,0, 1, 2 ,0, 1};
    Methods.task9271(data3);
    Assert.assertArrayEquals(data3,result3,0.0001);

    double[]data4 = new double[]{4, 2, 3 ,4 ,3, 2};
    double[] result4 = new double[]{2 ,0 ,1 ,2, 1 ,0};
    Methods.task9271(data4);
    Assert.assertArrayEquals(data4,result4,0.0001);

    double[]data5 = new double[]{4 ,4, 4 ,4, 4, 3, 2 ,1};
    double[] result5 = new double[]{3, 3, 3, 3 ,3 ,2, 1, 0};
    Methods.task9271(data5);
    Assert.assertArrayEquals(data5,result5,0.0001);

    double[]data6 = new double[]{4 ,4, 4 ,4};
    double[] result6 = new double[]{0, 0 ,0, 0};
    Methods.task9271(data6);
    Assert.assertArrayEquals(data6,result6,0.0001);

    double[]data7 = new double[]{4 ,3};
    double[] result7 = new double[]{1,0};
    Methods.task9271(data7);
    Assert.assertArrayEquals(data7,result7,0.0001);
}

    @Test //task15
    public void task4847test (){
//        boolean A = Methods.task4847(37,59,83);
//        Assert.assertFalse(A);
//
//        boolean A1 = Methods.task4847(19,19,41);
//        Assert.assertFalse(A1);

        Assert.assertFalse(Methods.task4847(37,59,83));
        Assert.assertTrue(Methods.task4847(19,19,41));
        Assert.assertTrue(Methods.task4847(7,11,11));
        Assert.assertTrue(Methods.task4847(67,-67,67));
        Assert.assertTrue(Methods.task4847(1,1,1));
    }

    @Test //task15
    public void task4847_1test (){
        Assert.assertFalse(Methods.task4847_1(37,59,83));
        Assert.assertTrue(Methods.task4847_1(19,19,41));
        Assert.assertTrue(Methods.task4847_1(7,11,11));
        Assert.assertTrue(Methods.task4847_1(67,-67,67));
        Assert.assertTrue(Methods.task4847_1(1,1,1));
    }

    @Test
    public void test9020test () {

        double A1 = 3;
        double X1 =  Methods.task9020(60) ;
        Assert.assertEquals(A1,X1,0.0001);

        Assert.assertEquals(0,Methods.task9020(61),0.0001);
    }

    @Test
    public void test(){
        String data = "Данные\nодин\nдва\nтри\nчетыре";
        Scanner s = new Scanner(data);
        int actual = Programm4488_1.work(s);
        Assert.assertEquals(5,actual,0.0001);
    }

}
