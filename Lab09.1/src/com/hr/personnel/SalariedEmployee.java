package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    private double salary;

    public static double STANDARD_DEDUCTION = 10000.0;

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

    @Override
    public void payTaxes() {
        double taxes = TaxPayer.SALARIED_TAX_RATE * getSalary();
        System.out.println(getName() + " paid tax amount:" + taxes);
    }

    @Override
    public double getStandardDeduction() {
        return STANDARD_DEDUCTION;
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