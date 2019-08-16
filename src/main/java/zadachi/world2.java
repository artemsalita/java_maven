package zadachi;

import java.util.Random;

public class world2 {

    public static void main(String[] args) {

        Random r = new Random();
        int timer = 0;

        int prihodClienta = 5 + r.nextInt(15 - 5);
        int processDuration;
        int tipClienta = r.nextInt(2);
        int clients = 0;
        int startclients = 0;
        int startLunch = 204;
        int endLunch = 300;
        int endDay = 504;

        System.out.println("Первый клиент пришёл в " + prihodClienta + " минут" + " Клиентов в очереди " + clients + " человек");
        if (tipClienta == 0) {
            processDuration = 12 + r.nextInt(24 - 12);
            System.out.println("Тип клиента 1" + " Время стрижки " + processDuration + " минут");
        } else {
            processDuration = 12 + r.nextInt(24 - 12) + 8 + r.nextInt(12 - 8);

            System.out.println("Тип клиента 2" + " Время стрижки и бритья " + processDuration + " минут");
        }

        int endtime = prihodClienta + processDuration;


        System.out.println("Клиент обработан в " + endtime + " минут");
        System.out.println();



        while (timer <= 540) {

            if (prihodClienta == timer) {

                prihodClienta = prihodClienta + 5 + r.nextInt(15 - 5);

                System.out.println("Следующий клиент пришёл в " + prihodClienta + " минут" + " Клиентов в очереди " + clients + " человек");
                clients++;

            }
            if (endtime == timer) {

                System.out.println("Клиент обработан в " + endtime + " минут");
                clients--;  //!! срабатывает только первый раз
                System.out.println("Клиентов в очереди " + clients + " человек");
                System.out.println("");

                tipClienta = r.nextInt(2);

                if (tipClienta == 0) {
                    processDuration = 12 + r.nextInt(24 - 12);
                    System.out.println("Тип клиента 1" + " Время стрижки " + processDuration + " минут");
                } else {
                    processDuration = 12 + r.nextInt(24 - 12) + 8 + r.nextInt(12 - 8);

                    System.out.println("Тип клиента 2" + " Время стрижки и бритья " + processDuration + " минут");
                }

                if (clients > 0) {
                    endtime = endtime + processDuration;
                } else endtime = prihodClienta + processDuration;

            }

//            if (prihodClienta <= endLunch && prihodClienta >=startLunch){
//                prihodClienta = endLunch;
//            }
//
//            if (startLunch == timer){
//                System.out.println("");
//                System.out.println("Обед");
//                System.out.println("");
//                timer = endLunch;
//            }

            if (timer >= endDay) {
                System.out.println("");
                System.out.println("Рабочий день окончен");
                break;
            }

            timer++;
        }
    }
}
