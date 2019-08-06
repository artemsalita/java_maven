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

        double result3;

        src.x = 10;
        src.y = 10;
        dest.x = 13;
        dest.y = 14;

        direction = Methods.backwardTask(src, dest);
        Assert.assertEquals(5.000, direction.distance, 0.0001);
        Assert.assertEquals(53.1301, direction.angle, 0.0001);

        src.x = 24;
        src.y = 4;
        dest.x = 3;
        dest.y = 17;

        direction = Methods.backwardTask(src, dest);
        Assert.assertEquals(24.6982, direction.distance, 0.0001);
        Assert.assertEquals(148.2405, direction.angle, 0.0001);

        src.x = 23;
        src.y = 25;
        dest.x = 12;
        dest.y = 16;

        direction = Methods.backwardTask(src, dest);
        Assert.assertEquals(14.2127, direction.distance, 0.0001);
        Assert.assertEquals(219.2894, direction.angle, 0.0001);

        src.x = 3;
        src.y = 11;
        dest.x = 13;
        dest.y = 5;

        direction = Methods.backwardTask(src, dest);
        Assert.assertEquals(11.6619, direction.distance, 0.0001);
        Assert.assertEquals(329.0362, direction.angle, 0.0001);

        src.x = 5;
        src.y = 5;
        dest.x = 5;
        dest.y = 10;

        direction = Methods.backwardTask(src, dest);
        Assert.assertEquals(5.0000, direction.distance, 0.0001);
        Assert.assertEquals(90.0000, direction.angle, 0.0001);

        src.x = 10;
        src.y = 5;
        dest.x = 5;
        dest.y = 5;

        direction = Methods.backwardTask(src, dest);
        Assert.assertEquals(5.0000, direction.distance, 0.0001);
        Assert.assertEquals(180.0000, direction.angle, 0.0001);

        src.x = 5;
        src.y = 10;
        dest.x = 5;
        dest.y = 5;

        direction = Methods.backwardTask(src, dest);
        Assert.assertEquals(5.0000, direction.distance, 0.0001);
        Assert.assertEquals(270.0000, direction.angle, 0.0001);

        src.x = 5; //Xa
        src.y = 5; //Ya
        dest.x = 10; //Xb
        dest.y = 5; //Yb

        direction = Methods.backwardTask(src, dest);
        Assert.assertEquals(5.0000, direction.distance, 0.0001);
        Assert.assertEquals(360.0000, direction.angle, 0.0001);

        //конструкторы

        src = new Point2(10, 10);
        dest = new Point2(13, 14);
        direction = Methods.backwardTask(src, dest);
        Assert.assertEquals(5.000, direction.distance, 0.0001);
        Assert.assertEquals(53.1301, direction.angle, 0.0001);

        src = new Point2(24, 4);
        dest = new Point2(3, 17);
        direction = Methods.backwardTask(src, dest);
        Assert.assertEquals(24.6982, direction.distance, 0.0001);
        Assert.assertEquals(148.2405, direction.angle, 0.0001);

        src = new Point2(23, 25);
        dest = new Point2(12, 16);
        direction = Methods.backwardTask(src, dest);
        Assert.assertEquals(14.2127, direction.distance, 0.0001);
        Assert.assertEquals(219.2894, direction.angle, 0.0001);

        src = new Point2(3, 11);
        dest = new Point2(13, 5);
        direction = Methods.backwardTask(src, dest);
        Assert.assertEquals(11.6619, direction.distance, 0.0001);
        Assert.assertEquals(329.0362, direction.angle, 0.0001);

        src = new Point2(5, 5);
        dest = new Point2(5, 10);
        direction = Methods.backwardTask(src, dest);
        Assert.assertEquals(5.0000, direction.distance, 0.0001);
        Assert.assertEquals(90.0000, direction.angle, 0.0001);

        src = new Point2(10, 5);
        dest = new Point2(5, 5);
        direction = Methods.backwardTask(src, dest);
        Assert.assertEquals(5.0000, direction.distance, 0.0001);
        Assert.assertEquals(180.0000, direction.angle, 0.0001);

        src = new Point2(5, 10);
        dest = new Point2(5, 5);
        direction = Methods.backwardTask(src, dest);
        Assert.assertEquals(5.0000, direction.distance, 0.0001);
        Assert.assertEquals(270.0000, direction.angle, 0.0001);

        src = new Point2(5, 5);
        dest = new Point2(10, 5);
        direction = Methods.backwardTask(src, dest);
        Assert.assertEquals(5.0000, direction.distance, 0.0001);
        Assert.assertEquals(360.0000, direction.angle, 0.0001);

        //еще один статический метод

        src = Point2.make2(5, 10);
        dest = Point2.make2(5, 5);
        direction = Methods.backwardTask(src, dest);
        Assert.assertEquals(5.0000, direction.distance, 0.0001);
        Assert.assertEquals(270.0000, direction.angle, 0.0001);

        //статический метод

        src = Point2.make(5, 5);
        dest = Point2.make(10, 5);
        direction = Methods.backwardTask(src, dest);
        Assert.assertEquals(5.0000, direction.distance, 0.0001);
        Assert.assertEquals(360.0000, direction.angle, 0.0001);

    }
}