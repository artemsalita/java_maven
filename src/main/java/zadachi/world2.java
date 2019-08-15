package zadachi;

import java.util.Random;

public class world2 {

    public static void main(String[] args) {

        Random r = new Random();
        int timer = 0;

        int prihodClienta = 25 + r.nextInt(45 - 25);
        int processDuration;
        int tipClienta = r.nextInt(2);
        int clients = -1;
//        int startclients = 0;
        int startLunch = 204;
        int endLunch = 300;
        int endDay = 504;

        if (tipClienta == 0) {
            processDuration = 12 + r.nextInt(24 - 12);
            System.out.println("Тип клиента 1" + " Время стрижки " + processDuration + " минут");
        } else {
            processDuration = 12 + r.nextInt(24 - 12) + 8 + r.nextInt(12 - 8);

            System.out.println("Тип клиента 2" + " Время стрижки и бритья " + processDuration + " минут");
        }

        int endtime = prihodClienta + processDuration;

        while (timer <= 540) {

            if (prihodClienta == timer) {

                System.out.println("Клиент пришёл в " + prihodClienta + " минут");
                clients++;
                System.out.println("Клиентов в очереди " + clients + " человек");

                prihodClienta = prihodClienta + 25 + r.nextInt(45 - 25);
            }
            if (endtime == timer) {
                tipClienta = r.nextInt(2);

                if (tipClienta == 0) {
                    processDuration = 12 + r.nextInt(24 - 12);
                    System.out.println("Тип клиента 1" + " Время стрижки " + processDuration + " минут");
                } else {
                    processDuration = 12 + r.nextInt(24 - 12) + 8 + r.nextInt(12 - 8);

                    System.out.println("Тип клиента 2" + " Время стрижки и бритья " + processDuration + " минут");
                }

                if (endtime <= prihodClienta) {
                    endtime = prihodClienta + processDuration;
                    System.out.println("Время простоя");
                } else {
                    endtime = endtime + processDuration;
                    System.out.println("Время ожидания");
                }
                System.out.println("Клиент обработан в " + endtime + " минут");
                clients--;  //!! срабатывает только первый раз
                System.out.println("Клиентов в очереди " + clients + " человек");
                System.out.println("");
            }

            if (startLunch == timer){
                System.out.println("");
                System.out.println("Обед");
                System.out.println("");
                timer = endLunch;
            }

            if (timer >= endDay) {
                System.out.println("");
                System.out.println("Рабочий день окончен");
                break;
            }

            timer++;
        }
    }
}
