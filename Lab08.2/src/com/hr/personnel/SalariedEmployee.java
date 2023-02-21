package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    //business methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid salary: "+ getSalary());
    }

    public void takeVacation() {
        System.out.println(getName());
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return super.toString() + "Employee: name=" + getName() + ", hireDate=" + getHireDate() +
                ", salary=" + getSalary();}
}