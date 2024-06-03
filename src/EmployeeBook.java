import java.util.Objects;
public class EmployeeBook {
    public final String FORMAT_FINANCE = "%,18.2f руб.";
    public final String STRING_NOT_FOUND = "(не найдено)";
    public final int RESULT_NOT_FOUND = -1;
    public final int RESULT_NOT_ADDED = -2;
    public String stouneText(boolean stoune, String aText0, String aText1) { /* Возвращает одну из заданных
                                                                        строк в зависимости от истинности аргумента */
        if (stoune) return aText0; else return aText1;
    }
    public String stouneIntText(int stoune, int left, String aText0, String aText1) { /* Возвращает одну из заданных
                                                             строк в зависимости от результата сравнения аргументов */
        if (stoune == left) return aText0; else return aText1;
    }
    private double cPercent = 10;
    private int DepartmentSet[] = {0, 4, 1};
    private int k = DepartmentSet.length;
    private Employee employee[] = new Employee[15];
    private int departmentSelector;
    private class Employee {
        private static int _id;
        private int id;
        private String firstname;
        private String surname;
        private String patronymic;
        private int department;
        private double salary;
        public Employee(String surname, String firstname, String patronymic, int department, double salary) {
            this.surname = surname;
            this.firstname = firstname;
            this.patronymic = patronymic;
            this.department = department;
            this.salary = salary;
            this.id = _id;
            this._id++;
        }
        public String getFirstname() {
            return firstname;
        }
        public String getSurname() {
            return surname;
        }
        public String getPatronymic() {
            return patronymic;
        }
        public int getDepartment() {
            return department;
        }
        public int getId() {
            return id;
        }
        public double getSalary() {
            return salary;
        }
        public void setDepartment(int department) {
            this.department = department;
        }
        public void setSalary(double salary) {
            this.salary = salary;
        }
        public String toString() {
            return "id: " + id + ", ФИО: [" + String.join(" ", surname, firstname, patronymic) +
                    "]" + stouneText((departmentSelector == 0) ,", отдел: " + department, "") +
                ", зар.плата: " + String.format(FORMAT_FINANCE, salary);
        }
//        @Override

    }
    public EmployeeBook() {
        departmentSelector = 0;
        fillStaff();
    }

    public int getDepartmentSelector() {
        return departmentSelector;
    }

    public void setDepartmentSelector(int departmentSelector) {
        this.departmentSelector = departmentSelector;
    }

    private void fillStaff() { /* Заполнение списка сотрудников */
        java.util.Random random = new java.util.Random();
        int k = employee.length - 5;
        for (int i = 1; i <= k; i++) {
            employee[i - 1] = new Employee("Фамилия\u2013" + i, "Имя\u2013" + i,
                    "Отчество\u2013" + i,
                    random.nextInt(4) + 1, random.nextFloat(120000) + 19000);
        }
    }
    private int aCountStaff(int specificDepartment) {
        int result = 0;
        int k = employee.length;
        for (int i = 0; i < k; i++) {
            if (employee[i] != null && (specificDepartment == 0 || specificDepartment == employee[i].getDepartment()))
                result++;
        }
        return result;
    }
    private String aStaff(int specificDepartment) { /* Извлечение списка сотрудников */
        String result = "";
        int k = employee.length;
        for (int i = 0; i < k; i++) {
            if (employee[i] != null && (specificDepartment == 0 || specificDepartment == employee[i].getDepartment()))
//                result = result + "\n" + employee[i].toString(specificDepartment);
//                result = result + "\n" + employee[i].toString();
                result = result + "\n" + employee[i];
        }
        return result;
    }
    private String aStaffSfpOnly(int specificDepartment) { /* Извлечение ФИО-списка сотрудников */
        String result = "";
        int k = employee.length;
        for (int i = 0; i < k; i++) {
            if (employee[i] != null && (specificDepartment == 0 || specificDepartment == employee[i].getDepartment()))
                result = String.join("\n", result, String.join(" ", employee[i].getSurname(),
                        employee[i].getFirstname(), employee[i].getPatronymic()));
        }
        return result;
    }
    private double aSummSalary(int specificDepartment) { /* Извлечение суммы зарплат всех сотрудников
                                                                                                        за месяц */
        double result = 0;
        int k = employee.length;
        for (int i = 0; i < k; i++) {
            if (employee[i] != null && (specificDepartment == 0 ||
                    specificDepartment == employee[i].getDepartment())) {
                result = result + employee[i].getSalary();
            }
        }
        return result;
    }
    private int aidLessThanSalary(int specificDepartment, double threshold) { /* Извлечение идентификатора
                                                   сотрудника с уровнем зар. платы, меньшей чем задаваемое значение */
        double f = 0;
        int result = RESULT_NOT_FOUND; /* возвращает код ошибки «не найдено» */
        int k = employee.length;
        for (int i = 0; i < k; i++) {
            if (employee[i] != null && (specificDepartment == 0 || specificDepartment == employee[i].getDepartment())
                    && employee[i].getSalary() < threshold) {
                result = employee[i].getId();
                break;
            }
        }
        return result;
    }
    private int getIndexById(int id) { /* Возвращает индекс элемента массива с заданным значением */
        int result = 0;
        int k = employee.length;
        for (int i = 0; i < k; i++)
            if (employee[i] != null && employee[i].getId() == id) {
                result = i;
                break;
            }
        return result;
    }
    private int aidMinSalary(int specificDepartment) { /* Извлечение идентификатора сотрудника
                                                                                         с минимальной зар. платой */
        double f = employee[getIndexById(aidMaxSalary(specificDepartment))].getSalary();
        int result = RESULT_NOT_FOUND;
        int k = employee.length;
        for (int i = 0; i < k; i++) {
            if (employee[i] != null && (specificDepartment == 0 || specificDepartment == employee[i].getDepartment())
                    && employee[i].getSalary() < f) {
                f = employee[i].getSalary();
                result = employee[i].getId();
            }
        }
        return result;
    }
    private int aidMaxSalary(int specificDepartment) { /* Извлечение идентификатора сотрудника
                                                                                        с максимальной зар. платой */
        double f = 0;
        int result = RESULT_NOT_FOUND;
        int k = employee.length;
        for (int i = 0; i < k; i++) {
            if (employee[i] != null && (specificDepartment == 0 || specificDepartment == employee[i].getDepartment())
                && employee[i].getSalary() > f) {
                    f = employee[i].getSalary();
                    result = employee[i].getId();
            }
        }
        return result;
    }
    private double aMiddleSalary(int specificDepartment) { /* Извлечение среднего арифм. зар. плат */
        return aSummSalary(specificDepartment) / aCountStaff(specificDepartment);
    }
    private String TotalSalary(int iDepartment) {
        return "Общая зарплата сотрудников" + " (" +
                EmployeeBook.specificDepartmentText(DepartmentSet[iDepartment]) + "):\n" +
                String.format(FORMAT_FINANCE, aSummSalary(DepartmentSet[iDepartment]));
    }
    //    public String () {
//        return ;
//    }
    private void biasSalary(double cPercent) {
        int k = employee.length;
        for (int i = 0; i < k; i++) {
            employee[i].setSalary(cPercent * 0.01 * employee[i].getSalary() + employee[i].getSalary());
        }
    }
    private static String specificDepartmentText(int specificDepartment) {
        if (specificDepartment == 0) return "все отделы"; else return "отдел " + specificDepartment;
    }

    public String MinSalary() {
        int id = aidMinSalary(departmentSelector);
        return "Сотрудник с минимальной зар. платой" + " (" +
            specificDepartmentText(0) + "):\n" +
            stouneIntText(id, RESULT_NOT_FOUND, STRING_NOT_FOUND, String.format("%s", employee[id]));
    }
    public String MaxSalary() {
        return "Сотрудник с МАКСимальной зар. платой" + " (" +
                specificDepartmentText(0) + "):\n" +
                employee[aidMaxSalary(departmentSelector)];
    }
    public String MiddleSalary() {
        return "Среднее арифм. зар. плат" + " (" + specificDepartmentText(departmentSelector) +
                "):\n" +  String.format(FORMAT_FINANCE, aMiddleSalary(departmentSelector));
    }
    public String
    TotalSalary() {
        return TotalSalary(departmentSelector);
    }
    public String CorrectSalary(int cPercent) {
//        if (departmentSelector != 0) {
        biasSalary(cPercent);
        return "Cписок сотрудников после индексации зар. плат на " + cPercent +
                " %" + " (" + specificDepartmentText(departmentSelector) + "):\n" +
                aStaff(departmentSelector);
//        }
    }
    public String Staff(boolean modeFull) {
        if (modeFull) {
            return "Список подробно о сотрудниках" + " (" + specificDepartmentText(departmentSelector) +
                "):" + aStaff(departmentSelector);
        } else {
            return "Список ФИО сотрудников" + " (" + specificDepartmentText(departmentSelector) +
                "):" + aStaffSfpOnly(departmentSelector);
        }
    }
    public int addStaff(String firstname, String surname, String patronymic, int department, double salary) {
        int k = employee.length;
        int result = RESULT_NOT_ADDED;
        for (int i = 0; i < k; i++) {
            if (employee[i] == null ) {
                employee[i] = new Employee(firstname, surname, patronymic, department, salary);
                result = employee[i].getId();
                break;
            }
        }
        return result;
    }
}

