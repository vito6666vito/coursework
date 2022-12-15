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
        int minSalary = 59000;
        for (int i = 0; i < person.length; i++) {
            if (person[i] != null) {
                if (person[i].getSalary() < minSalary) {
                    minSalary = person[i].getId();
                }
            }
        }
        System.out.println("Id сотрудника с минимальной заработной платой: " + minSalary);
        return minSalary;
    }

    public static int maxSalaryId(Employee[] person) {
        int maxSalary = -1;
        int maxId = 0;
        for (int l = 0; l < person.length; l++) {
            if (person[l] != null) {
                if (person[l].getSalary() > maxSalary) {
                    maxSalary = person[l].getSalary();
                    maxId = person[l].getId();
                }
            }
        }
        System.out.println("Id сотрудника с максимальной заработной платой: " + maxId);
        return maxSalary;
    }

    public static double middleSalary(Employee[] person) {
        double middleSalary = 0;
        for (int i = 0; i < person.length; i++) {
            if (person[i] != null) {
                middleSalary += person[i].getSalary() / 10;
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
