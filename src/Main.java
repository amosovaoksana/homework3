public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задача 1");
        byte brush = 126;
        System.out.println("Значение переменной кисть с типом byte равно " + brush);
        short matches = 32750;
        System.out.println("Значение переменной спички с типом short равно" + matches);
        int cactus = 999;
        System.out.println("Значение переменной кактус с типом int равно" + cactus);
        long largePits = 898476300L;
        System.out.println("Значение переменной большие ямы с типом long равно"+ largePits);
        float colors = 3.363637f;
        System.out.println("Значение переменной цветов с типом float" + colors);
        double rackets = 2.47473839930930;
        System.out.println("Значение переменной ракеток с типом double" + rackets);

        //Задача 2
        System.out.println("Задача 2");
        double a  = 27.12;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        boolean d = false;
        System.out.println(d);
        short e = 569;
        System.out.println(e);
        short f = -159;
        System.out.println(f);
        short g = 27897;
        System.out.println(g);
        byte h = 67;
        System.out.println(h);

        //Задача 3
        System.out.println("Задача 3");
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short totalSheet = 480;
        System.out.println("Всего листов бумаги на каждого ученика равен" + totalSheet / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna ));

        //Задача 4
        System.out.println("Задача 4");
        byte performanceOfTheMachine = 16;
        byte time = 2;
        System.out.println("Сколько бутылок в минуту производится" + performanceOfTheMachine / time);
        byte oneMinute = 16/2;
        byte twentyMinutes = 20;
        System.out.println("За 20 минут машина произвела бутылок" + (oneMinute * twentyMinutes));
        byte hour = 60;
        short day = 24;
        System.out.println("За сутки машина произвела бутылок" + (hour * day * oneMinute));
        System.out.println("За три дня машина произвела бутылок" + (hour * (day + day + day) * oneMinute));
        short month = 30;
        System.out.println("За месяц - тридцать дней машина произвела бутылок" + (month * day * hour * oneMinute));

        //Задание 5
        System.out.println("задача 5");
        byte cansOfpPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        byte klass = 20;
        System.out.println("В школе где классов" + cansOfpPaint / (whitePaint + brownPaint));
        System.out.println("Нужно банок белой краски" + whitePaint * klass);
        System.out.println("Нужно банок коричневой краски" + brownPaint * klass);

        //Задание 6
        System.out.println("Задача 6");
        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        double kg = 1000;
        byte gram = 1;
        System.out.println((banana *5 + milk * 2 + iceCream * 2 + egg * 4) * gram / kg);

        //Задание 7
        System.out.println("Задача 7");
        short sportsman = 7000;
        short gramDay1 = 250;
        short gramDay2 = 500;
        System.out.println("по 250 грамм в день будет худеть дней" + sportsman / gramDay1);
        System.out.println("По 500 грамм в день будет худеть дней" + sportsman / gramDay2);
        System.out.println("В среднем для похудения надо дней " + (sportsman / gramDay1 + sportsman / gramDay2) / 2);

        //Задание 8
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaAfterThePromotion = 74530;
        int denisAfterThePromotion = 92050;
        int kristinaAfterThePromotion = 83853;
        System.out.println((67760 / 100 * 10) + masha);
        System.out.println((83690 / 100 * 10) + denis);
        System.out.println((76230 / 100 * 10) + kristina);
        byte year = 12;
        System.out.println("Маша после повышения получает" + mashaAfterThePromotion + "Годовой доход вырос на" + (mashaAfterThePromotion * 12 - (masha * year)));
        System.out.println("Денис после повышения получает" + denisAfterThePromotion + "Годовой доход вырос на" + (denisAfterThePromotion * 12 - (denis * year)));
        System.out.println("Кристина после повышения получает" + kristinaAfterThePromotion + "Годовой доход вырос на" + (kristinaAfterThePromotion * 12 - (kristina * year)));












































    }
}