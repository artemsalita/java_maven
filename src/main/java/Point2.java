public class Point2 {
    public static double distanceBetween (double xa, double ya, double xb, double yb){
        double d = Math.sqrt((xa - xb)*(xa - xb) + (yb - ya) * (yb - ya));
        return  d;
    }

     int x;
     int y;


    public static double distanceBetween (Point2 a, Point2 b){
        double d = Math.sqrt((a.x - b.x)*(a.x - b.x) + (b.y - a.y) * (b.y - a.y));
        return  d;

    }

}
