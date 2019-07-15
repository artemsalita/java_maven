public class Point2 {
    public static double distanceBetween (double xa, double ya, double xb, double yb){
        double d = Math.sqrt((xa - xb)*(xa - xb) + (yb - ya) * (yb - ya));
        return  d;
    }
}
