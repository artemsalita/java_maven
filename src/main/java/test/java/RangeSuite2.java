import org.junit.Assert;
import org.junit.Test;

public class RangeSuite2 {

    @Test
    public void hasIntersectionIntsTest() {
        boolean result2;
        result2 = Range2.hasIntersection(2, 3, 5, 7);
        Assert.assertFalse(result2);

        result2 = Range2.hasIntersection(11, 17, 13, 19);
        Assert.assertTrue(result2);

        result2 = Range2.hasIntersection(23, 37, 29, 31);
        Assert.assertTrue(result2);

        result2 = Range2.hasIntersection(43, 53, 41, 47);
        Assert.assertTrue(result2);

        result2 = Range2.hasIntersection(5, 15, 0, 30);
        Assert.assertTrue(result2);

        result2 = Range2.hasIntersection(67, 71, 59, 61);
        Assert.assertFalse(result2);
    }

    @Test (expected = IllegalArgumentException.class) //сразу объявим что ожидаем исключение
    public void hasIntersectionIntsWrongLeftTest(){
        Range2.hasIntersection(79, 73, 83, 89);
    }

    @Test (expected = IllegalArgumentException.class)
    public void hasIntersectionIntsWrongRightTest(){
        Range2.hasIntersection(97, 101, 107, 103);
    }

    @Test
    public void hasIntersectionRangesTest(){
        Range2 left = new Range2();
        Range2 right = new Range2();
        boolean result2;

       left.from = 2;
       left.to = 3;

       right.from = 5;
       right.to = 7;

       result2 = Range2.hasIntersection(left,right);
        Assert.assertFalse(result2);

        left.from = 11;
        left.to = 17;

        right.from = 13;
        right.to = 19;

        result2 = Range2.hasIntersection(left,right);
        Assert.assertTrue(result2);


    }

}