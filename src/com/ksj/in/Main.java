package com.ksj.in;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee("trupti",20000);
        ArrayList <Employee> list = new ArrayList<>();
        list.add(emp);
        list.add(new Employee("Bhagyashri",15000));
        list.add(new Employee("Rachana",12000));
        System.out.println(list);
    }
}
class Employee{
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}