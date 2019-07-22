import org.junit.Assert;
import org.junit.Test;

public class PointSuite2 {

    @Test
    public void distanceBetweenValuesTest() {
        double result2;
        result2 = Point2.distanceBetween(1, 1, 3, 4);
        Assert.assertEquals(3.6056, result2, 0.0001);
        result2 = Point2.distanceBetween(-2, 4, 8, -10);
        Assert.assertEquals(17.2046, result2, 0.0001);
        result2 = Point2.distanceBetween(0, 0, -5, -7);
        Assert.assertEquals(8.6023, result2, 0.0001);
        result2 = Point2.distanceBetween(-1, -3, 2, 9);
        Assert.assertEquals(12.3693, result2, 0.0001);
    }


    @Test
    public void distanceBetweenPointsTest() {


        Point2 dest = new Point2();
        Point2 src = new Point2();

    src.x = 1;
    src.y = 1;

    dest.x = 3;
    dest.y = 4;

        double result2;
        result2 = Point2.distanceBetween(src,dest);
        Assert.assertEquals(3.6056, result2, 0.0001);

        src.x = -2;
        src.y = 4;

        dest.x = 8;
        dest.y = -10;

        result2 = Point2.distanceBetween(src,dest);
        Assert.assertEquals(17.2046, result2, 0.0001);

        src.x = -0;
        src.y = 0;

        dest.x = -5;
        dest.y = -7;

        result2 = Point2.distanceBetween(src,dest);
        Assert.assertEquals(8.6023, result2, 0.0001);

        src.x = -1;
        src.y = -3;

        dest.x = 2;
        dest.y = 9;

        result2 = Point2.distanceBetween(src,dest);
        Assert.assertEquals(12.3693, result2, 0.0001);
    }


}