import org.junit.Assert;
import org.junit.Test;

public class CupSuite {

    @Test
    public void testcup (){
//Arrange
        Cup c1 = new Cup();
        c1.t = 3;
        c1.v = 5;

        Cup c2 = new Cup();
        c2.t = 7;
        c2.v = 11;



//Act
    Cup testcuosuite = Cup_calc.Combine(c1,c2);

//Assert
        Assert.assertEquals(10,testcuosuite.t);
        Assert.assertEquals(16,testcuosuite.v);
    }
}
