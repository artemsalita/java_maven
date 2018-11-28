/**
 * Created by adm on 28.11.2018.
 */
public class Circle {
    public int r;


    public static double area(int r){
        return Math.PI*r*r;

    }
    public static double area(Circle a){
        return Math.PI*a.r*a.r;


    }
}
