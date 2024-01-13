import java.util.Objects;

public class Employee {
    private static int _id;
    private int id;
    private String firstname;
    private String surname;
    private String patronymic;
    private int department;
    private double salary;
    public Employee(String firstname, String surname, String patronymic, int department, double salary) {
        this.firstname = firstname;
        this.surname = surname;
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
    public void setDepartment(int department) {
        this.department = department;
    }
    @Override
    public String toString() {
        return "id: " + id + ", nsp: [" + firstname + " " + surname + ' ' + patronymic + "], " +
            "department: " + department + ", salary: " + salary + " rur.\n";
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

