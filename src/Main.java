import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//task1
        {
            System.out.println("\nTask 1");

            int year = new Scanner(System.in).nextInt();
            checkYearIsLeapAndPrint(year);
            System.out.println();
        }

//task2
        {
            System.out.println("\nTask 2");

            int clientDeviceYear = 2015;
            String deviceAndYear = validateDeviceAndYear(1, clientDeviceYear);
            System.out.println(deviceAndYear);
        }

//task3
        {
            System.out.println("\nTask 3");

            int deliveryDistance = 95;
            String deliveryTime = calculateDeliveryDistance(deliveryDistance);

            System.out.printf("Доставка в пределах %s км потребует дней: %s",deliveryDistance, deliveryTime );
        }
    }

    //task1
    public static void checkYearIsLeapAndPrint(int yearInsideThisMethod) {
        boolean leapYearConditions = (yearInsideThisMethod % 400 == 0) || (yearInsideThisMethod % 4 == 0 && yearInsideThisMethod % 100 != 0);
        boolean validYear = yearInsideThisMethod >= 1584;
        if (validYear && leapYearConditions) {
            System.out.printf("%s год - високосный год", yearInsideThisMethod);
        } else {
            System.out.printf("%s год - не високосный год", yearInsideThisMethod);
        }
    }

    //task2
    public static String validateDeviceAndYear(int deviceType, int year) {
        int currentYear = LocalDate.now().getYear();
        if (deviceType == 0 && year < currentYear) {
            return "Установите облегченную версию приложение для iOS по ссылке";
        } else if (deviceType == 0) {
            return "Установите версию приложение для iOS по ссылке";
        } else if (deviceType == 1 && year < currentYear) {
            return "Установите облегченную версию приложение для Android по ссылке";
        } else if (deviceType == 1) {
            return "Установите версию приложение для Android по ссылке";
        } else {
            return "Такая версия не поддерживается";
        }
    }

    //task3
    public static String calculateDeliveryDistance(int distance) {
        if (distance > 100) {
            return "Доставки нет";
        } else {
            return ((int) Math.ceil((double) (distance - 20) / 40) + 1) + "";
        }
    }
}