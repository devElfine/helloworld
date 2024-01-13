// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Employee employee[] = new Employee[10];
    private static void fillStaff() { /* Заполнение списка сотрудников, кроме первого и последнего, итого 8 человек */
        int k = employee.length;
        for (int i = 1; i < 6; i++) {
            employee[i] = new Employee("n" + i,"s" + i,"p" + i, i,i * 1000);
        }
    }
    private static String echoStaff() { /* Извлечение полного списка сотрудников */
        String output = "";
        int k = employee.length;
        for (int i = 0; i < k; i++) {
            if (employee[i] != null)
                output = output + employee[i].toString();
        }
        return output;
//        return employee[1].toString().concat(employee[2].toString());
    }
    public static void main(String[] args) {
//        final_1
//        System.out.println(employee[0].toString());
        fillStaff();
        System.out.println("\tПолный список сотрудников:");
        System.out.println(echoStaff());
    }
}