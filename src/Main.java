// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        int totalPayedPerMonth = 0;
        int k = arr.length;
        for (int i = 0; i < k; i++) {
            totalPayedPerMonth = totalPayedPerMonth + arr[i];
        }
        System.out.println("\nTask 1 result:");
        System.out.println("Сумма трат за месяц: " + totalPayedPerMonth + " рублей.");
    }
    public static void task2() {
        int[] arr = generateRandomArray();

        int minimalItem = 200000;
        int maximalItem = 0;
        int k = arr.length;
        for (int i = 0; i < k; i++) {
            if (arr[i] < minimalItem) {
                minimalItem = arr[i];
            }
            if (arr[i] > maximalItem) {
                maximalItem = arr[i];
            }
        }
        System.out.println("\nTask 2 result:");
        System.out.println("Минимальная выплата: " + minimalItem + " рублей.");
        System.out.println("Максимальная выплата: " + maximalItem + " рублей.");
    }
    public static void task3() {
        int[] arr = generateRandomArray();
        int totalPayedPerMonth = 0;
        int k = arr.length;
        for (int i = 0; i < k; i++) {
            totalPayedPerMonth = totalPayedPerMonth + arr[i];
        }
        int mid = 0;
        mid = totalPayedPerMonth / k;
        System.out.println("\nTask 3 result:");
        System.out.println("Средняя выплата: " + mid + " рублей.");
    }
    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int k = reverseFullName.length;
        System.out.println("\nTask 4 result:");
        for (int i = 0; i < k; i++) {
            System.out.print(reverseFullName[k - 1 - i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("--hw9-vector-and-matrix");
        task1();
        task2();
        task3();
        task4();
        }
}