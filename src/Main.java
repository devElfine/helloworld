// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("--hw10-strings--");

        // Task 1
        System.out.println("\nTask 1 result:");
        String lastName = "Ivanov";
        String firstName = "Ivan";
        String middleName = "Ivanovich";

        System.out.println("Employee`s L.F.M \u2014 " + lastName + " " + firstName + " " + middleName + ".");

        // Task 2
        System.out.println("\nTask 2 result:");
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Employee`s L.F.M for filling out the report \u2014 " + fullName.toUpperCase() + ".");

        // Task 3
        System.out.println("\nTask 3 result:");
        String lastNameA = "Иванов";
        String firstNameA = "Семён";
        String middleNameA = "Семёнович";
        String fullNameA = lastNameA + " " + firstNameA + " " + middleNameA;
        System.out.println("Данные Ф.И.О. сотрудника \u2014 " + fullNameA.replace('ё','е') + ".");
    }
}