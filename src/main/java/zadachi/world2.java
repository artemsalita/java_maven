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
        int clients = -1;
        int startclients = 0;
        int startLunch = 204;
        int endLunch = 300;
        int endDay = 504;

        while (timer <= 540) {

            if (prihodClienta == timer) {
                System.out.println("Клиент пришёл в " + prihodClienta + " минут");
                clients++;
                System.out.println("Клиентов в очереди " + clients + " человек");

                if (tipClienta == 0) {
                    strijka = 12 + r.nextInt(24 - 12);
                    System.out.println("Тип клиента 1" + " Время стрижки " + strijka + " минут");
                    if (endtime <= prihodClienta){
                        endtime = prihodClienta + strijka;
                        System.out.println("Время простоя");
                    } else {
                        endtime = endtime + strijka ;
                        System.out.println("Время ожидания");
                    }
                } else {
                    strijkaBrite = 12 + r.nextInt(24 - 12) + 8 + r.nextInt(12 - 8);
                    System.out.println("Тип клиента 2" + " Время стрижки и бритья " + strijkaBrite + " минут");

                    if (endtime <= prihodClienta){
                        endtime = prihodClienta + strijkaBrite;
                        System.out.println("Время простоя");
                    } else {
                        endtime = endtime + strijkaBrite;
                        System.out.println("Время ожидания");
                    }
                }

                prihodClienta = prihodClienta + 25 + r.nextInt(45 - 25);
            }
            if (endtime == timer) {
                System.out.println("Клиент обработан в " + endtime + " минут");
                clients--;  //!! срабатывает только первый раз
                System.out.println("Клиентов в очереди " + clients + " человек");
                System.out.println("");
            }

            if (timer >= endDay){
                System.out.println("");
                System.out.println("Рабочий день окончен");
                break;
            }

            timer++;
        }
    }
}
