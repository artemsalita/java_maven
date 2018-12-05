import org.junit.Assert;
import org.junit.Test;

/**
 * Created by adm on 28.11.2018.
 */
public class CircleSuite {

    @Test
    public void area(){
        double result;

//        result = Circle.area(3);
//        Assert.assertEquals(28.2743,result,0.0001);

        Circle one = new Circle();
        one.r = 3;
        result = Circle.area(one);
        Assert.assertEquals(28.2743,result,0.0001);


        Circle two = new Circle();
        two.r = 5;

        result = Circle.area(two);
        Assert.assertEquals(78.5398,result,0.0001);

        Circle three = new Circle();
        three.r = 7;
        result = Circle.area(three);
        Assert.assertEquals(153.9380,result,0.0001);

    }
}
