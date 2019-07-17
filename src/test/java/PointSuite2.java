import org.junit.Assert;
import org.junit.Test;

public class PointSuite2 {

    @Test
    public void distanceBetweenValuesTest(){
        double result2;
       result2 = Point2.distanceBetween (1,1,3,4);
        Assert.assertEquals(3.6056, result2, 0.0001);
        result2 = Point2.distanceBetween(-2, 4, 8, -10);
        Assert.assertEquals(17.2046,result2,0.0001);
        result2 = Point2.distanceBetween(0, 0, -5, -7);
        Assert.assertEquals(8.6023,result2, 0.0001);
        result2 = Point2.distanceBetween(-1, -3, 2, 9);
        Assert.assertEquals(12.3693,result2, 0.0001);
    }
}
