/**
 * Created by adm on 05.12.2018.
 */
public class Range {

    public int from;
    public int to;

    public static boolean hasIntersection (int leftA, int leftB, int rightA, int rightB) {


        if(leftB<leftA) {
            String mesaga = "Значение A должно быть меньше значения B";
            IllegalArgumentException M = new IllegalArgumentException(mesaga);
            throw M;
        }
        if(rightB<rightA) {
            String mesaga = "Значение A должно быть меньше значения B";
            IllegalArgumentException M = new IllegalArgumentException(mesaga);
            throw M;
        }
        if(rightA<leftB&&leftA<rightB){
            //System.out.println("пересекаются");
            return true;
        }
        else {
            //System.out.println("не пересекаются");
            return false;
        }
    }

    public static boolean hasIntersection (Range left, Range right){
        if(left.to<left.from) {
            String mesaga = "Значение A должно быть меньше значения B";
            IllegalArgumentException M = new IllegalArgumentException(mesaga);
            throw M;
        }
        if(right.to<right.from) {
            String mesaga = "Значение A должно быть меньше значения B";
            IllegalArgumentException M = new IllegalArgumentException(mesaga);
            throw M;
        }
        if(right.from<left.to&&left.from<right.to){
            //System.out.println("пересекаются");
            return true;
        }
        else {
            //System.out.println("не пересекаются");
            return false;
        }
    }

}
