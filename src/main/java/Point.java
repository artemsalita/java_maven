/**
 * Created by adm on 28.11.2018.
 */
public class Point {
    public int x;
    public int y;
    public String color;
    public Point (int x, int y){
//        this.x = x;
//        this.y = y;
        this.color = "white";

    }


//    public Point(int px, int py){
//        this.x = px;
//        this.y = py;
//
//    }


    public static double distanceBetween (int ax, int ay, int bx, int by){
        int dx = ax - bx;
        int dy = ay - by;


        return Math.sqrt(dx * dx + dy * dy);
    }

//    public static double distanceBetween (Point a, Point b){
//        int dx = b.x - a.x;
//        int dy = b.y - a.y;
//
//        return Math.sqrt(dx * dx + dy * dy);
//    }

    public double distanceTo (int bx, int by){

        int dx = this.x - bx;
        int dy = this.y - by;

        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distanceTo (Point b){
        int dx = this.x - b.x;
        int dy = this.y - b.y;

        return Math.sqrt(dx * dx + dy * dy);

    }



}
