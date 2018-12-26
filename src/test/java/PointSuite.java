import org.junit.Assert;
import org.junit.Test;

/**
 * Created by adm on 28.11.2018.
 */
public class PointSuite {

    @Test
    public void distanceBetweenIntsTest() {
        double result;

        result = Point.distanceBetween(1, 1, 3, 4);
        Assert.assertEquals(result, 3.6056, 0.0001);
        result = Point.distanceBetween(-2, 4, 8, -10);
        Assert.assertEquals(result, 17.2046, 0.0001);
        result = Point.distanceBetween(0, 0, -5, -7);
        Assert.assertEquals(result, 8.6023, 0.0001);
        result = Point.distanceBetween(-1, -3, 2, 9);
        Assert.assertEquals(result, 12.3693, 0.0001);
    }

    @Test
    public void ditanceToIntsTest() {

        Point src = new Point();

        src.x = 1;
        src.y = 1;

        double d;

        d = src.distanceTo(3, 4);

        Assert.assertEquals(d, 3.6056, 0.0001);
    }

    @Test
    public  void distanceToPointTest (){
        Point src = new Point();
        Point dest = new Point();

        src.x = -2;
        src.y = 4;

        dest.x = 8;
        dest.y = -10;

        double d;

        d = src.distanceTo(dest);
        Assert.assertEquals(d,17.2046,0.0001);

    }

}



