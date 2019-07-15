import org.junit.Assert;
import org.junit.Test;

public class PointSuite2 {

    @Test
    public void distanceBetweenValuesTest(){
        double result2;
       result2 = Point2.distanceBetween (1,1,3,4);
        Assert.assertEquals(3.6056, result2, 0.0001);
    }
}
