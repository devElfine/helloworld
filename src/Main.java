import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int isLeap(int aYear) {
        int ret = 0;
        if (aYear > 1584) {
            if (((aYear % 400 == 0) || (aYear % 4 == 0)) && (aYear % 100 != 0)) {
                ret = 1;
            } else ret = 0;
        } else {
            ret = -1;
        }
        return ret;
    }
    public static void isModern(boolean osAndroid, int relYear) {
        int currentYear = LocalDate.now().getYear();
        System.out.println("Client's device was produced in " + relYear + " year.\n");
        System.out.print("Please, go download and setup our ");
        if (relYear < currentYear) System.out.println("LITE version of app");
            else System.out.print("MODERN version of app ");

        System.out.print("for ");
        if (osAndroid) System.out.print("Android");
            else System.out.print("iOS");
        System.out.println(" at <link>.\n");
    }

    public static void main(String[] args) {
        System.out.println("--hw11-methods--");

        // task 1
        System.out.println("\nTask 1 result:");
        int[] yearsSet = {1582, 1584, 1981, 2020, 2021, 2024};
        int res = 0;
        for (int i = 0; i < yearsSet.length; i++) {
            res = isLeap(yearsSet[i]);
            System.out.print("Год " + yearsSet[i] + " \u2014 ");
            switch (res) {
                case 0:
                    System.out.println("не високосный.");
                    break;
                case 1:
                    System.out.println("високосный.");
                    break;
                case -1:
                    System.out.println("ошибка диапазона (до 1585 года не определено).");
                    break;
            }
        }
        // task 2
        System.out.println("\nTask 2 result:");
        isModern(true, 2015);

        // task 3
        System.out.println("\nTask 3 result:");

    }
}