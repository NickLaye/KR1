package com.company;

public class Main {


    public static int countStaffSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц составляет " + sum + " рублей.");
        return sum;
    }


    public static void countMinSalary(Employee[] employees) {
        int min = employees[0].getSalary();
        String staffMan = "";
        for (Employee employee : employees) {
            if (min > employee.getSalary()) {
                min = employee.getSalary();
                staffMan = employee.getName();
            }
        }
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой " + min + " рублей " + staffMan);
    }

    public static void countMaxSalary(Employee[] employees) {
        int max = employees[0].getSalary();
        String staffMan = "";
        for (Employee employee : employees) {
            if (max < employee.getSalary()) {
                max = employee.getSalary();
                staffMan = employee.getName();
            }
        }
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой " + max + " рублей " + staffMan);
    }

    public static void typeAllStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void averageSalary(Employee[] employees) {
        int sum = countStaffSalary(employees);
        int average = sum / employees.length;
        System.out.println("Средняя зарплата " + average);
    }

    public static void countAllStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }


    public static void main(String[] args) {
        Employee[] employee = new Employee[10];

        employee[0] = new Employee("Иванов Иван", 1, 10000);
        employee[1] = new Employee("Петров Петр", 1, 20000);
        employee[2] = new Employee("Сидоров Сидр", 2, 30000);
        employee[3] = new Employee("Дмитриев Дмитрий", 2, 40000);
        employee[4] = new Employee("Олегов Олег", 3, 50000);
        employee[5] = new Employee("Николаев Николай", 3, 60000);
        employee[6] = new Employee("Сергеев Сергей", 4, 70000);
        employee[7] = new Employee("Максимов Максим", 4, 80000);
        employee[8] = new Employee("Игорев Игорь", 5, 90000);
        employee[9] = new Employee("Алексеев Алексей", 5, 100000);

        typeAllStaff(employee);
        countMinSalary(employee);
        countMaxSalary(employee);
        countStaffSalary(employee);
        averageSalary(employee);
        countAllStaff(employee);

    }



}
