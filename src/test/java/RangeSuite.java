import org.junit.Assert;
import org.junit.Test;

/**
 * Created by adm on 05.12.2018.
 */
public class RangeSuite {

    @Test
    public void hasIntersectionIntsTest() {
        boolean result;

        result = Range.hasIntersection(2, 3, 5, 7);
        Assert.assertFalse(result);

        result = Range.hasIntersection(11, 17, 13, 19);
        Assert.assertTrue(result);

        result = Range.hasIntersection(23, 37, 29, 31);
        Assert.assertTrue(result);

        result = Range.hasIntersection(43, 53, 41, 47);
        Assert.assertTrue(result);

        result = Range.hasIntersection(5, 15, 0, 30);
        Assert.assertTrue(result);

        result = Range.hasIntersection(67, 71, 59, 61);
        Assert.assertFalse(result);

        try {
            result = Range.hasIntersection(79, 73, 83, 89);
            Assert.fail("все сломалось");

        }catch (IllegalArgumentException exx){}

        try {
            result = Range.hasIntersection(97,101,107,103);
            Assert.fail("все сломалось");

        }catch (IllegalArgumentException exx){}


}

    @Test(expected = IllegalArgumentException.class)
    public void hasIntersectionIntsWrongLeftTest(){
        Range.hasIntersection(79, 73, 83, 89);
    }

    @Test(expected = IllegalArgumentException.class)
    public void hasIntersectionIntsWrongRightTest(){
        Range.hasIntersection(97,101,107,103);
    }

    @Test
    public void hasIntersectionRangesTest(){
        boolean result;
        Range left = new Range();
        left.from = 2;
        left.to = 3;

        Range right = new Range();
        right.from = 5;
        right.to = 7;

result = Range.hasIntersection(left,right);
        Assert.assertFalse(result);

    }

}