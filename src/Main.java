// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("--hw8-vector-and-matrix");

        // task 1
        System.out.println("\nTask 1 result:");
        int[] positions = new int[] {1, 2, 3};
        float[] balls = {1.14f, 3.22f, 5.68f};
        char[] characters = {'w', 'y', 'i'};

        // task 2
        System.out.println("\nTask 2 result:");
        System.out.println("Элементы массива positions:");
        int k = positions.length;
        for (int i = 0; i < k; i++) {
            System.out.print(positions[i]);
            if (i < k - 1) {
                System.out.print(",");
            } else System.out.println("\n");
        }
        System.out.println("Элементы массива balls:");
        for (int i = 0; i < k; i++) {
            System.out.print(balls[i]);
            if (i < k - 1) {
                System.out.print(",");
            } else System.out.println("\n");
        }
        System.out.println("Элементы массива characters:");
        for (int i = 0; i < k; i++) {
            System.out.print(characters[i]);
            if (i < k - 1) {
                System.out.print(",");
            } else System.out.println("\n");
        }

        // task 3
        System.out.println("\nTask 3 result:");
        System.out.println("Элементы массива positions (reversed):");
        for (int i = 0; i < k; i++) {
            System.out.print(positions[k - 1 - i]);
            if (i < k - 1) {
                System.out.print(",");
            } else System.out.println("\n");
        }
        System.out.println("Элементы массива balls (reversed):");
        for (int i = 0; i < k; i++) {
            System.out.print(balls[k - 1 - i]);
            if (i < k - 1) {
                System.out.print(",");
            } else System.out.println("\n");
        }
        System.out.println("Элементы массива characters (reversed):");
        for (int i = 0; i < k; i++) {
            System.out.print(characters[k - 1 - i]);
            if (i < k - 1) {
                System.out.print(",");
            } else System.out.println("\n");
        }

        // task 4
        System.out.println("\nTask 4 result:");
        for (int i = 0; i < k; i++) {
            if (positions[i] % 2 != 0) {
                positions[i]++;
            }
        }
        System.out.println("Элементы массива positions (переделанные в чётные):");
        for (int i = 0; i < k; i++) {
            System.out.print(positions[i]);
            if (i < k - 1) {
                System.out.print(",");
            } else System.out.println("\n");
        }
    }
}