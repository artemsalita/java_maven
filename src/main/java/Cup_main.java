public class Cup_main {

    public static void main(String[] args) {

        Cup c1 = new Cup();
        c1.t = 3;
        c1.v = 5;

        Cup c2 = new Cup();
        c2.t = 7;
        c2.v = 11;

        Cup v3 = new Cup();

        v3 = Cup_calc.Combine (c1,c2);
        System.out.println(v3.t);
        System.out.println(v3.v);

    }
}
