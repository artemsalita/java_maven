import org.junit.Assert;
import org.junit.Test;


public class GeodesySuite {
    @Test
    public void backwardTaskTest() {
        //Arrange

        //Act
//        Direction directiondir = Methods.backwardTask(10, 10, 13, 14);
        //Assert
//        Assert.assertEquals(1, directiondir.angle, 0.0001);
//        Assert.assertEquals(1, directiondir.distance, 0.0001);


        //задача 5
        Point2 src = new Point2();

        Point2 dest = new Point2();
        Direction direction = new Direction();

        src.x = 10;
        src.y = 10;
        dest.x = 13;
        dest.y = 14;

        direction = Methods.backwardTask(src, dest);
        Assert.assertEquals(5.000,direction.distance, 0.0001);
        Assert.assertEquals(53.1301,direction.angle, 0.0001);
    }
}