package com.company;

public class Employee {

    //private static int id;
    private final String name;
    private int department;
    public int salary;
    public static int counter = 0;
    private int id;


    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = getCounter();
        counter++;
    }

    public String getName() {
        return this.name;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " ФИО: " + this.name + " Отдел: " + this.department + " ЗП: " + this.salary;
    }
}
