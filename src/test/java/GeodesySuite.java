import org.junit.Assert;
import org.junit.Test;


public class GeodesySuite {
    @Test
    public void backwardTaskTest(){

        Direction directiondir = Methods.backwardTask(10,10,13,14);
        Assert.assertEquals(directiondir.angle,1,0.0001);
        Assert.assertEquals(directiondir.distance,2,0.0001);
    }
}
