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
        int leftA = 97, leftB = 101, rightA = 107, rightB = 103;

        Range.hasIntersection(leftA,leftB,rightA,rightB);
    }

    @Test
    public void hasIntersectionRangesTest(){
        boolean result;

        Range left = new Range();
        Range right = new Range();


        left.from = 2;
        left.to = 3;
        right.from = 5;
        right.to = 7;
        result = Range.hasIntersection(left,right);
        Assert.assertFalse(result);

        left.from = 11;
        left.to = 17;
        right.from = 13;
        right.to = 19;
        result = Range.hasIntersection(left,right);
        Assert.assertTrue(result);

        left.from = 23;
        left.to = 37;
        right.from = 29;
        right.to = 31;
        result = Range.hasIntersection(left,right);
        Assert.assertTrue(result);

        left.from = 43;
        left.to = 53;
        right.from = 47;
        right.to = 57;
        result = Range.hasIntersection(left,right);
        Assert.assertTrue(result);

        try{
        left.from = 79;
        left.to = 73;
        right.from = 83;
        right.to = 89;
            result = Range.hasIntersection(left,right);
            Assert.fail("все сломалось");
        }catch (IllegalArgumentException rr){}

        try{
            left.from = 97;
            left.to = 101;
            right.from = 107;
            right.to = 103;
            result = Range.hasIntersection(left,right);
            Assert.fail("все сломалось");
        }catch (IllegalArgumentException rr){}








    }

}