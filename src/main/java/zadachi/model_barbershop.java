package zadachi;

import java.util.Random;

public class model_barbershop {

    public static void main(String[] args){

        Random r = new Random();

        int startDay = 0;
        int startLunch = 204;
        int endLunch = 300;
        int endDay = 504;


        int prihodPervogoClienta = 25 + r.nextInt(45 - 25);
        int prihodSledClienta = prihodPervogoClienta +25 + r.nextInt(45 - 25);


        System.out.println("Первый клиент пришёл через " + prihodPervogoClienta + " минут");
        System.out.println("Следующий клиент пришёл через " + prihodSledClienta + " минут");


            while (prihodSledClienta <= startLunch) {
                prihodSledClienta = prihodSledClienta + 25 + r.nextInt(45 - 25);;

                if (prihodSledClienta > startLunch){
                   break;
                }
                System.out.println("Следующий клиент пришёл через " + prihodSledClienta + " минут");
            }

        System.out.println("Обед");

            prihodSledClienta = endLunch;

        while (prihodSledClienta <= endDay) {

            prihodSledClienta = prihodSledClienta + 25 + r.nextInt(45 - 25);

            if (prihodSledClienta > endDay){
                break;
            }
            System.out.println("Следующий клиент пришёл через " + prihodSledClienta + " минут");
        }

        }

    }


