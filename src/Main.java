import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Ex1
        System.out.println("Задача 1");

        int year = 2021;
        checkingLeapYear(year);
        System.out.println();

        //Ex2
        System.out.println("Задача 2");

        int clientOS = 1;
        int clientDeviceYear = 2023;
        selectOS(clientOS, clientDeviceYear);
        System.out.println();

        //Ex3
        System.out.println("Задача 3");

        int deliveryDistance = 105;
        int limitDays = 3;

        int days = deliveryTime(deliveryDistance);
        if (days <= limitDays) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
        System.out.println();
    }

    public static void checkingLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) && year > 1584) {
            System.out.println(year + " год  - високосный год");
        } else {
            System.out.println(year + " год  - невисокосный год");
        }
    }

    public static void selectOS(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        String os = clientOS == 0 ? "iOS" : "Android";
        String isLite = clientDeviceYear < currentYear ? "облегченную " : "";

        System.out.println("Установите " + isLite + "версию приложения для " + os + " по ссылке");
    }

    public static int deliveryTime(int distance) {
        int days = 0;
        int[] distanceBoundaries = {0, 20, 60, 100};

        for (int i : distanceBoundaries) {
            if (distance > i) {
                days++;
            }
        }
        return days;
    }
}