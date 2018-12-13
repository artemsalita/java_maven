public class Programm3864 {
    public static void main(String[] args) {

        int Xa = 10, Ya = 10, Xb = 13, Yb = 14;
        double dX = Xb - Xa;
        double dY = Yb - Ya;
        double r = (Math.atan(Math.abs(dY / dX)))/(Math.PI/180);
        double angle;
        double distance = Math.sqrt(dX * dX + dY * dY);


        if (dX >= 0 && dY > 0) {
            angle = r;
            System.out.println("Угол в 1 четврети");
            System.out.println("Горизонтальное проложение " + distance);
            System.out.println("Дирекционный угол " + angle);
        }
        if (dX < 0 && dY >= 0) {
            angle = 180 - r;
            System.out.println("Угол в 2 четврети");
            System.out.println("Горизонтальное проложение " + distance);
            System.out.println("Дирекционный угол " + angle);
        }
        if (dX <= 0 && dY < 0) {
            angle = 180 + r;
            System.out.println("Угол в 3 четврети");
            System.out.println("Горизонтальное проложение " + distance);
            System.out.println("Дирекционный угол " + angle);
        }
        if (dX > 0 && dY <= 0) {
            angle = 360 - r;
            System.out.println("Угол в 4 четврети");
            System.out.println("Горизонтальное проложение " + distance);
            System.out.println("Дирекционный угол " + angle);
        }



    }
}
