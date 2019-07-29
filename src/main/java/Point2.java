public class Point2 {
    public static double distanceBetween (double xa, double ya, double xb, double yb){
        double d = Math.sqrt((xa - xb)*(xa - xb) + (yb - ya) * (yb - ya));
        return  d;
    }

     int x;
     int y;

    public Point2(){}

    public static double distanceBetween (Point2 a, Point2 b){
        double d = Math.sqrt((a.x - b.x)*(a.x - b.x) + (b.y - a.y) * (b.y - a.y));
        return  d;

    }

    public static Point2 zero (){
        Point2 instance = new Point2();
        instance.x = 0;
        instance.y = 0;
        return  instance;
    }

    public static Point2 make(int px, int py){
        Point2 instance = new Point2();
        instance.x = px;
        instance.y = py;
        return  instance;
    }

    public Point2 (int px, int py){
        x = px;
        y = py;
    }
}

//https://metanit.com/java/tutorial/3.1.php - про классы и объекты


