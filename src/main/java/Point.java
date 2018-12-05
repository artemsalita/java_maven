/**
 * Created by adm on 28.11.2018.
 */
public class Point {
    public int x;
    public int y;


//    public static double distanceBetween (int ax, int ay, int bx, int by){
//        int dx = ax - bx;
//        int dy = ay - by;
//
//        return Math.sqrt(dx * dx + dy * dy);
//    }
//
//    public static double distanceBetween (Point a, Point b){
//        int dx = b.x - a.x;
//        int dy = b.y - a.y;
//
//        return Math.sqrt(dx * dx + dy * dy);
//    }

    public double distanceTo (int dx, int dy){
//        int dx = ax - bx;
//        int dy = ay - by;

        return Math.sqrt(dx * dx + dy * dy);
    }



}
