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


}