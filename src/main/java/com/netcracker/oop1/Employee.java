package com.netcracker.oop1;

public class Employee {

    private int id;

    private String firstName;

    private String lastName;

    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Employee[id = " + id + ", name = " + getName() + "salary = " + salary;
    }

    public int geAnnualSalary() {
        return salary * 12;
    }

    //to get a valid method result, the return type must be a double
    public int raiseSalary(int percent) {
        return salary * (1 + percent / 100);
    }

}