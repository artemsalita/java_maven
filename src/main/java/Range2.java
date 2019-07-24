public class Range2 {

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

    public static boolean hasIntersection() {
        Range2 from = new Range2();
        Range2 to = new Range2();
        boolean result;

    }
}