public class EmployeeService {
    public static int sumSalary(Employee[] person) {
        int sum = 0;
        for (int i = 0; i < person.length; i++) {
            if (person[i] != null) {
                sum += person[i].getSalary();
            }
        }

        System.out.println("Сумма трат за месяц на заработные платы составила " + sum + " рублей");
        return sum;
    }

    public static int minSalaryId(Employee[] person) {
        int minSalary = person[0].getSalary();
        for (int i = 0; i != person.length; i++) {
            if (person[i] != null) {
                if (person[i].getSalary() < minSalary) {
                    minSalary = person[i].getSalary();
                    System.out.println("Id сотрудника с минимальной заработной платой: " + person[i].getId());
                }
            }
        }

        return minSalary;

    }

    public static int maxSalaryId(Employee[] person) {
        int maxSalary = person[9].getSalary();
        for (int i = 0; i < person.length; i++) {
            if (person[i] != null) {
                if (person[i].getSalary() > maxSalary) {
                    maxSalary = person[i].getSalary();
                    System.out.println("Id сотрудника с максимальной заработной платой: " + person[i].getId());
                }
            }
        }
        return maxSalary;
    }

    public static double middleSalary(Employee[] person) {
        double middleSalary = 0;
        if (person.length > 0) {
            int i = 0;
            if (person[i] != null) {
                int sum = 0;
                for (i = 0; i < person.length; i++) {
                    sum += person[i].getSalary();
                }
                middleSalary = sum / person.length;
            }
        }
        System.out.println("Среднее значение зарботной платы: " + middleSalary + " рублей");
        return middleSalary;

    }

    public static String fioEmployees(Employee[] person) {
        System.out.println(("ФИО всех сотрудников: " + person[0].getFIO() + ", " + person[1].getFIO() + ", " + person[2].getFIO() + ", "
                + person[3].getFIO() + ", " + person[4].getFIO() + ", " + person[5].getFIO() + ", " + person[6].getFIO() + ", "
                + person[7].getFIO() + ", " + person[8].getFIO() + ", " + person[9].getFIO() + "."));

        return null;
    }


}
