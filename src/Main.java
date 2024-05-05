import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year = new Scanner(System.in).nextInt();
        checkYearIsLeapAndPrint(year);
    }

    public static void checkYearIsLeapAndPrint(int leapYear) {
        boolean leapYearConditions = (leapYear % 400 == 0) || (leapYear % 4 == 0 && leapYear % 100 != 0);
        boolean validYear = leapYear >= 1584;
        if (validYear && leapYearConditions) {
            System.out.printf("%s год - високосный год", leapYear);
        } else {
            System.out.printf("%s год - не високосный год", leapYear);
        }
    }
}