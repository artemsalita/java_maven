public class Range2 {

    int from;
    int to;
    public Range2(){}

    public static boolean hasIntersection(int redA, int redB, int greenA, int greenB) {


        if (redB < redA) {
            String mesaga = "Некорректный интервал. Левая граница должна быть меньше правой";
            IllegalArgumentException M = new IllegalArgumentException(mesaga);
            throw M;
        }
        if (greenB < greenA) {

            String mesaga = "Некорректный интервал. Левая граница должна быть меньше правой";
            IllegalArgumentException M = new IllegalArgumentException(mesaga);
            throw M;
        }

//    rightA<leftB&&leftA<rightB
        if (greenA < redB && redA < greenB) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasIntersection(Range2 red, Range2 green) {
        if (red.to < red.from) {
            String mesaga = "Некорректный интервал. Левая граница должна быть меньше правой";
            IllegalArgumentException M = new IllegalArgumentException(mesaga);
            throw M;
        }
        if (green.to < green.from) {

            String mesaga = "Некорректный интервал. Левая граница должна быть меньше правой";
            IllegalArgumentException M = new IllegalArgumentException(mesaga);
            throw M;
        }

//    rightA<leftB&&leftA<rightB
        if (green.from < red.to && red.from < green.to) {
            return true;
        } else {
            return false;
        }
    }

    public static Range2 make(int rfrom, int rto){
        Range2 instance = new Range2();
        instance.from = rfrom;
        instance.to = rto;
        return  instance;
    }

    public Range2 (int rfrom, int rto){
        from = rfrom;
        to = rto;
    }

}