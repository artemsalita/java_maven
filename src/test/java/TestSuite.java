import org.junit.Assert;
import org.junit.Test;

public class TestSuite {
    @Test
    public void task4411test(){
        double q = Methods.task4411(11.13);
        double w = Methods.task4411(-7919);
        double e = Methods.task4411(0);
        Assert.assertEquals(18.13,q,0.001);
        Assert.assertEquals(-7912,w,0.001);
        Assert.assertEquals(7,e,0.001);
    }
    @Test
    public void task2790test(){
        double q = Methods.task2790(31);
        double w = Methods.task2790(90);
        double e = Methods.task2790(0);
        Assert.assertEquals(0.8572,q,0.001);
        Assert.assertEquals(0.0,w,0.001);
        Assert.assertEquals(1.0,e,0.001);

    }
    @Test

    public void task3946test(){
        int[] arr = new int[]{1,2,3,4,1};
        int[] arr2 = new int[]{1, 2 ,3, 4 ,1, 3 ,4 ,4 ,4 ,4};
        int[] arr3 = new int[]{};
        double qs = Methods.task3946(arr3);
        double qe = Methods.task3946(arr2);
        double qw = Methods.task3946(arr);
        Assert.assertEquals(2.2,qw,0.0001);
        Assert.assertEquals(3,qe,0.0001);
        Assert.assertEquals(0,qs,0.0001);


    }




}
