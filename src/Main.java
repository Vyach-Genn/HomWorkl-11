public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int year = 1500;// тестовый год
        printLeapYear(year);
        System.out.println();
        System.out.println("Task 2");
        int clientDeviceYear = 2015;// Введите год
        int modelTelephone = 1;// Введите модель
        installTheApplication(modelTelephone, clientDeviceYear);
        System.out.println();
        System.out.println("Task 3");
        int deliveryDistance = 105;// Введите расстояние
        int deliverydays = countingDaysDeliveryDistance(deliveryDistance);
        if (deliverydays > 0) {
            System.out.println("На расстояние " + deliveryDistance + " км, понадобится " + deliverydays + " суток.");
        } else {
            System.out.println("На расстояния свыше 100 км, доставка невозможна");
        }

    }

    public static void printLeapYear(int year) {

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

    public static void installTheApplication(int model, int age) {

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

    public static int countingDaysDeliveryDistance(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return 0;
        }

    }


}




