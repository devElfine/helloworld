// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // task 9
        System.out.println("\nTask 9 result:");
        float advanced = 12;
        float totalDep = 0f;
        for (int i = 1; i <= 12; i++) {
            totalDep = totalDep + (advanced * 1.01f);
            System.out.printf("Месяц " + monthsVerb[i - 1] + ". Сумма накоплений составляет " + totalDep +
                    " рублей.\n");
        }
    }
}