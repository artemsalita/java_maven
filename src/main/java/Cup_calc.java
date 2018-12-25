public class Cup_calc {

    public static Cup Combine(Cup c1,Cup c2) {

        Cup v3 = new Cup();

        v3.v = c1.v + c2.v;
        v3.t = c1.t + c2.t;

        return v3;
    }
}

