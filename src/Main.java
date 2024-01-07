// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("--hw7-cycles-1--");

        // task 1
        System.out.println("\nTask 1 result:");
        float advanced = 15000f;
        float totalDep = 0f;
        int totalMonths = 0;
        int totalFinal = 2459000;
        do {
            totalDep = totalDep + advanced;
            totalMonths++;
        }  while (totalDep <= totalFinal);
        System.out.printf("Месяц " + totalMonths + ". Сумма накоплений составляет " + totalDep +
                " рублей.\n");

        // task 2
        System.out.println("\nTask 2 result:");
        byte i = 1;
        while (i <= 10) {
            System.out.print(i + "\u0020");
            i++;
        }
        System.out.println("\n");
        i--;
        for (;i >0; i--) {
            System.out.print(i + "\u0020");
        }

        // task 3
        System.out.println("\nTask 3 result:");
        int populationY = 12000000;
        int birthratePerTH = 17;
        int mortalityrate = 8;

        int birthratePerYear = populationY / 1000 * 17;
        int mortalityratePerYear = populationY / 1000 * 8;
        int populationProgressPerYear = birthratePerYear - mortalityratePerYear;

        i = 1;
        while (i <= 10) {
            System.out.println("Год " + i + ". Численность населения составляет " + populationY + " человек.");
            populationY = populationY + populationProgressPerYear;
            i++;
        }

        // task 4
        System.out.println("\nTask 4 result:");
        float deposit = 15000f;
        float progressPercent = 7f;
        int target = 12000000;
        i = 1;
        while (deposit <= target) {
            System.out.println("Месяц " + i + ". Сумма накоплений " + deposit);
            deposit = 1 / progressPercent * deposit + deposit;
            i++;
        }
        System.out.println("Целевая сумма " + target + " накоплена за " + i + " месяцев.");

        // task 5
        System.out.println("\nTask 5 result:");
        deposit = 15000f;
        i = 1;
        while (deposit <= target) {
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ". Сумма накоплений " + deposit);
            }
            deposit = 1 / progressPercent * deposit + deposit;
            i++;
        }
        System.out.println("Целевая сумма " + target + " накоплена за " + i + " месяцев.");

        // task 6
        System.out.println("\nTask 6 result:");
        deposit = 15000f;
        int monthsLimit = 9 * 12;
        i = 1;
        while (i <= monthsLimit) {
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ". Сумма накоплений " + deposit);
            }
            deposit = 1 / progressPercent * deposit + deposit;
            i++;
        }

        // task 7
        System.out.println("\nTask 7 result:");
        int firstDayFriday = 3;
        int month = 3;
        int k = firstDayFriday;
        while (k <= 31) {
            if (k % 7 == 0 || k == firstDayFriday) {
                System.out.println("Сегодня, " + k + " число, " + month + " месяц --- " + " пятница, нужен отчёт.");
            }
            k++;
        }

        // task 8
        System.out.println("\nTask 8 result:");
        int currentYear = 2024;
        int startYear = currentYear - 200;
        int originYear = currentYear + 100;
        k = startYear;
        while (k <= originYear) {
            if (k % 79 == 0) {
                System.out.println("Год кометы --- " + k + ".");
            }
            k++;
        }
    }
}