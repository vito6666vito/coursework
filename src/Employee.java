import java.util.Objects;

public class Employee {
    private String FIO;
    private int department;
    private int salary;
    private static int counter;
    private int id;

    public Employee(String FIO, int department, int salary) {
        this.FIO = FIO;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    public int getId() {
        return this.id;
    }

    public String getFIO() {
        return this.FIO;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Id: " + id + " FIO: " + FIO + " Department: " + department + " Salary: " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(FIO, employee.FIO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIO, department, salary, id);
    }
}
