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
    public static void main(String[] args) {
        System.out.println("--hw11-methods--");

        // task 1
        System.out.println("\nTask 1 result:");
        int res = isLeap(1000)
        switch (res) {
            case: 0:
                System.out.println("не високосный.");
            case: 1:
                System.out.println("високосный.");
            case: -1:
                System.out.println("ошибка диапазона (до 1584 года не определено.");
        }
        System.out.println();
    }
}