import org.junit.Assert;
import org.junit.Test;


public class GeodesySuite {
    @Test
    public void backwardTaskTest(){
        //Arrange

        //Act
        Direction directiondir = Methods.backwardTask(10,10,13,14);
        //Assert
        Assert.assertEquals(1,directiondir.angle,0.0001);
        Assert.assertEquals(1,directiondir.distance,0.0001);
    }
}
