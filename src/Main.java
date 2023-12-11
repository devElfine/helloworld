// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("--hw6--");

        // task 1
        System.out.println("\nTask 1 result:");
        for (byte i = 1; i <= 10; i++) System.out.println(i);

        // task 2
        System.out.println("\nTask 2 result:");
        for (byte i = 10; i > 0; i--) System.out.println(i);

        // task 3
        System.out.println("\nTask 3 result:");
        for (byte i = 0; i <=17; i++) if (i % 2 == 0) System.out.println(i);

        // task 4
        System.out.println("\nTask 4 result:");
        for (int i = 10; i >= -10; i--) System.out.printf("%3d\n", i);

        // task 5
        System.out.println("\nTask 5 result:");
        for (int i = 1904; i <= 2096; i++)
            if (((i % 400 == 0) || (i % 4 == 0)) && (i % 100 != 0))
                System.out.println("\tГод (" + i + ") високосный.");

        // task 6
        System.out.println("\nTask 6 result:");
        for (int i = 7; i <= 98; i = i + 7) System.out.printf("%3d\n", i);

        // task 7
        System.out.println("\nTask 7 result:");
        for (int i = 1; i <= 512; i = i * 2) System.out.printf("%3d\n", i);

        // task 8
        System.out.println("\nTask 8 result:");
        String[] monthsVerb = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь",
            "октябрь", "ноябрь", "декабрь"};
        float totalDep = 0f;
        int advanced = 29000;
        for (int i = 1; i <= 12; i++) {
            totalDep = totalDep + advanced;
            System.out.printf("Месяц " + monthsVerb[i - 1] + ". Сумма накоплений составляет " + totalDep +
                    " рублей.\n");
        }

        // task 9
        System.out.println("\nTask 9 result:");
        totalDep = 0f;
        for (int i = 1; i <= 12; i++) {
            totalDep = totalDep + (advanced * 1.01f);
            System.out.printf("Месяц " + monthsVerb[i - 1] + ". Сумма накоплений составляет " + totalDep +
                    " рублей.\n");
        }

        // task 10
        System.out.println("\nTask 10 result:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + i*2);
        }
    }
}