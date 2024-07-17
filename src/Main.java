//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ex1
        System.out.println("Задача 1");

        int year = 2021;
        checkingLeapYear(year);

        //Ex2
        System.out.println("Задача 2");

        boolean clientOS = true;
        int clienDeviceYear = 2015;

        choosingOS(clientOS, clienDeviceYear);

    }

    public static void checkingLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) && year > 1584) {
            System.out.println(year + " год  - високосный год");
        } else {
            System.out.println(year + " год  - невисокосный год");
        }
    }

    public static void choosingOS(boolean clientOS, int clienDeviceYear){
        int targetYear = 2015;
        if (clientOS && targetYear > clienDeviceYear) {
            System.out.println("Установите облегченную версию приложения для для Android по ссылке");
        } else if (clientOS && targetYear <= clienDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (!clientOS && targetYear > clienDeviceYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

}