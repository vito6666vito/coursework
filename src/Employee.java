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

    public int getId(){
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
        this.department= department;
    }
    public void setSalary(int salary) {
        this.salary= salary;
    }

    public String toString() {
        return "Id: " + id + " FIO: " + FIO + " Department: " + department + " Salary: " + salary;
    }

}
