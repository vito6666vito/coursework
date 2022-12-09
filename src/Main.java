import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
                        Employee[] person = new Employee[10];
                        person[0] = new Employee("F1 I1 O1", 2, 31450);
                        person[1] = new Employee("F2 I2 O2", 2, 31400);
                        person[2] = new Employee("F3 I3 O3", 3, 40200);
                        person[3] = new Employee("F4 I4 O4", 5, 60000);
                        person[4] = new Employee("F5 I5 O5", 3, 40200);
                        person[5] = new Employee("F6 I6 O6", 5, 55800);
                        person[6] = new Employee("F7 I7 O7", 1, 39850);
                        person[7] = new Employee("F8 I8 O8", 3, 40200);
                        person[8] = new Employee("F9 I9 O9", 2, 31450);
                        person[9] = new Employee("F10 I10 O10", 3, 40200);

                        person[1].setDepartment(5);
                        person[6].setSalary(40200);

                        for (Employee e : person) {
                                System.out.println(e);
                        }
                        int sum = 0;
                        for (int i = 0; i < person.length; i++) {
                                sum += person[i].getSalary();
                        }
                        System.out.println("Сумма трат за месяц на заработные платы составила " + sum + " рублей");

                        int minSalary = 59000;
                        for (int i = 0; i < person.length; i++) {
                                if (person[i].getSalary() < minSalary) {
                                        minSalary = person[i].getId();
                                }
                        }
                        System.out.println("Id сотрудника с минимальной заработной платой: " + minSalary);

                        int maxSalary = -1;
                        int maxId = 0;
                        for (int l = 0; l < person.length; l++) {
                                if (person[l].getSalary() > maxSalary) {
                                        maxSalary = person[l].getSalary();
                                        maxId = person[l].getId();
                                }
                        }
                        System.out.println("Id сотрудника с максимальной заработной платой: " + maxId);

                        double middleSalary = 0;
                        for (int i = 0; i < person.length; i++) {
                                middleSalary += person[i].getSalary() / 10;
                        }
            System.out.println("Среднее значение зарботной платы: " + middleSalary + " рублей");

            System.out.println(("ФИО всех сотрудников: " + person[0].getFIO() + ", " + person[1].getFIO() + ", " + person[2].getFIO() + ", "
                    + person[3].getFIO() + ", " + person[4].getFIO() + ", " + person[5].getFIO() + ", " + person[6].getFIO() + ", "
                    + person[7].getFIO() + ", " + person[8].getFIO() + ", " + person[9].getFIO() +"."));
        }
}





