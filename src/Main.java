public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        byte age = 19; //Возраст
        if (age > 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }
        else{
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия.");
        }

        System.out.println("Задание 2");


        var temperature = -2; //температура в градусах
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        }
        else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");

        }

        System.out.println("Задание 3");

        var speed = 75; // Скорость в км/ч
        if (speed >= 60) {
            System.out.println("Если скорость "  + speed + " км/ч, то придётся заплатить штраф.");
        }
        else {
            System.out.println("Если скорость "  + speed + " км/ч, то можно ездить спокойно.");
        }

        System.out.println("Задание 4");

        byte age2 = 1;// Возраст
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад.");
        }
        else if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу.");
        }
        else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то его место в университете.");
        }
        else if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему пора ходить на работу.");
        }
        else {
            System.out.println("Если возраст человека равен " + age2 + ", то ребёнок сидит дома так как слишком мал.");
        }


        System.out.println("Задание 5");

        byte age3 = 15;
        if (age3 < 5) {
            System.out.println("Если возраст ребёнка равен " + age3 + ", то ему нельзя кататься на атракционе.");
        }
        else if (age3 >= 5 && age3 <= 14) {
            System.out.println("Если возраст ребёнка равен " + age3 + ", то можно кататься в сопровождении.");
        }
        else {
            System.out.println("Если возраст ребёнка равен " + age3 + ", то можно кататься без сопровождения.");
        }

        System.out.println("Задание 6");

        //Кол-во Всего мест
        byte сapacity = 102;
        //Кол-во Сидячих мест
        byte seatingCapacity = 60;
        //Кол-во стоячих мест
        byte capacityForStanding = (byte) (сapacity - seatingCapacity);


        byte a = 23; // Вводится количество пассажиров

        if (a == 102) {
            System.out.println("Вагон заполнен. Мест нет.");
        }
        else {
            if (a < seatingCapacity) {
                System.out.println("В вагоне " + (seatingCapacity - a) + " сидячих мест и " + capacityForStanding + " стоячих мест.");
            }
            else if ( a >=  seatingCapacity) {
                System.out.println("В вагоне "  + (сapacity - a) + " стоячих мест.");
            }
        }

        System.out.println("Задание 7");

        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three) {
            System.out.println("Наибольшее число первое = " + one);
        }
        else if (two > one && two > three) {
            System.out.println("Наибольшее число второе = " + two);
        }
        else {
            System.out.println("Наибольшее число третье = " + three);
        }
    }







    }



