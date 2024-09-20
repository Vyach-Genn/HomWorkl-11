public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int year = 1500;// тестовый год
        task1(year);
        System.out.println();
        System.out.println("Task 2");
        int clientDeviceYear = 2015;// Введите год
        int modelTelephone = 1;// Введите модель
        task2(modelTelephone, clientDeviceYear);
        System.out.println();
        System.out.println("Task 3");
        int deliveryDistance = 105;// Введите расстояние
        task3(deliveryDistance);

    }

    public static void task1(int year) {

        if (findingALeapYear(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — не високосный год");
        }
    }

    public static boolean findingALeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void task2(int model, int age) {

        if (model == 0 && age < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (model == 1 && age < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (model == 0 && age >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }

    public static void task3(int distance) {
        int day = 0;
        if (distance <= 20) {
            day = 1;
        } else if (distance <= 60) {
            day = 2;
        } else if (distance <= 100) {
            day = 3;
        } else {
            System.out.println("Свыше 100 км доставки нет");
            return;
        }
        System.out.println("Доставка на расстояние " +distance+" км занимает "+ day+" суток");

    }


}




