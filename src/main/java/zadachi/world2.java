package zadachi;

import java.util.Random;

public class world2 {

    public static void main(String[] args) {

        Random r = new Random();
        int timer = 0;
        int tipClienta = r.nextInt(2);
        int endtime = -1;
        int strijka;
        int strijkaBrite;
        int prihodClienta = 25 + r.nextInt(45 - 25);
        int clients = 0;
        int startclients = 0;

        while (timer <= 540) {

            if (prihodClienta == timer) {
                System.out.println("Клиент пришёл в " + prihodClienta + " минут");
                clients++;
                System.out.println("Клиентов в очереди " + clients + "человек");
                if (tipClienta == 0) {
                    strijka = 12 + r.nextInt(24 - 12);
                    System.out.println("Время стрижки " + strijka + " минут");
                    endtime = endtime + strijka + prihodClienta;
                } else {
                    strijkaBrite = 12 + r.nextInt(24 - 12) + 8 + r.nextInt(12 - 8);
                    endtime = endtime + strijkaBrite + prihodClienta;
                    System.out.println("Время стрижки и бритья " + strijkaBrite + " минут");
                }

                if (startclients <= endtime){
                    startclients = endtime - prihodClienta;
                }

                prihodClienta = prihodClienta + 25 + r.nextInt(45 - 25);
            }
            if (endtime == timer) {
                System.out.println("Клиент обработан в " + endtime + " минут");
                clients--;
                System.out.println("Клиентов в очереди " + clients + "человек");

            }



            timer++;
        }
    }
}
