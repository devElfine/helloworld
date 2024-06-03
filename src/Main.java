import java.math.BigDecimal;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static EmployeeBook EmployeeBook = new EmployeeBook();
    public static void main(String[] args) {
        System.out.println(EmployeeBook.Staff(true));
        System.out.println(EmployeeBook.TotalSalary());
        System.out.println(EmployeeBook.MinSalary());
        System.out.println(EmployeeBook.MaxSalary());
        System.out.println(EmployeeBook.MiddleSalary());
        System.out.println("Добавлен новый служащий, id [" + EmployeeBook.addStaff("Семён", "Павлович", "Батькович", 3,
            33555.50d) + "].");
        System.out.println(EmployeeBook.Staff(true));
        System.out.println(EmployeeBook.MiddleSalary());
//        System.out.println(EmployeeBook.CorrectSalary(10));
//        System.out.println(EmployeeBook.Staff(false));
//        System.out.println(EmployeeBook.Staff(false));
    }
}