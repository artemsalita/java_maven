public class Range2 {

public static boolean hasIntersection(int redA, int redB, int greenA, int greenB) {


    if (redB < redA) {
        String mesaga = "Некорректный интервал. Левая граница должна быть меньше правой";
        IllegalArgumentException M = new IllegalArgumentException(mesaga);
        throw M;
    }
    if (greenB < greenA)

    {

        String mesaga = "Некорректный интервал. Левая граница должна быть меньше правой";
        IllegalArgumentException M = new IllegalArgumentException(mesaga);
        throw M;
    }
    if (redA < greenB && redA < greenB) {
        return true;
    } else {
        return false;


    }

}}