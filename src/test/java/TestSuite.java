import org.junit.Assert;
import org.junit.Test;

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
        int z1 = Methods.task3669(8,13);
        int z2 = Methods.task3669(159,161);
        int z3 = Methods.task3669(13,8);
        int z4 = Methods.task3669(35,24);
        int z5 = Methods.task3669(648,648);
        int z6 = Methods.task3669(-2,600);

        Assert.assertEquals(1235521,z1,0.00001);
        Assert.assertEquals(4095841,z2,0.00001);
        Assert.assertEquals(14,z3,0.00001);
        Assert.assertEquals(36,z4,0.00001);
        Assert.assertEquals(0.0,z5,0.00001);
        Assert.assertEquals(601.0,z6,0.00001);
    }

    //task9
    @Test
    public void task1292test(){

        String[] a = new String[] {"a", "b", "c", "d", "e", "f", "g", "h"};
        String X = Methods.task1292("b");

        Assert.assertEquals("ab",X);

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


}
