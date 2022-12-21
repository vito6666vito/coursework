import java.util.Arrays;

public class EmployeeService {
    public static int sumSalary(Employee[] person) {
        int sum = 0;
        for (int i = 0; i < person.length; i++) {
            if (person[i].getSalary() >= 0) {
                sum += person[i].getSalary();
            }
        }
        System.out.println("Сумма трат за месяц на заработные платы составила " + sum + " рублей");
        return sum;
    }

    public static int minSalaryId(Employee[] person) {
        int i = 0;
        int m = 0;
        for (; i < person.length; i++) {
            if (person[i] != null) {
                m = person[i].getSalary();
                break;
            }
        }
        int minSalary = m;
        for (; i < person.length; i++) {
            if (person[i] != null) {
                if (person[i].getSalary() >= 0) {
                    if (person[i].getSalary() < minSalary) {
                        minSalary = person[i].getSalary();
                        System.out.println("Id сотрудника с минимальной заработной платой: " + person[i].getId());

                    }
                }
            }
        }
        return minSalary;
    }

    public static int maxSalaryId(Employee[] person) {
        int maxSalary = 0;
        int maxSalaryId = 0;
        for (int i = 0; i < person.length; i++) {
            if (person[i].getSalary() >= 0) {
                if (person[i].getSalary() > maxSalary) {
                    maxSalary = person[i].getSalary();
                    maxSalaryId = person[i].getId();
                }
            }
        }
        System.out.println("Id сотрудника с максимальной заработной платой: " + maxSalaryId);
        return maxSalaryId;
    }

    public static double middleSalary(Employee[] person) {
        double middleSalary = 0;
        int i = 0;
        if (person[i].getSalary() >= 0) {
            int sum = 0;
            for (i = 0; i < person.length; i++) {
                sum += person[i].getSalary();
            }
            middleSalary = sum / person.length;
        }
        System.out.println("Среднее значение зарботной платы: " + middleSalary + " рублей");
        return middleSalary;
    }

    public static String fioEmployees(Employee[] person) {
        String fio = "";
        for (int i = 0; i < person.length; i++) {
            if (person[i] != null) {
                fio = person[i].getFIO();
                System.out.println(fio);
            }
        }
        return null;
    }


}
