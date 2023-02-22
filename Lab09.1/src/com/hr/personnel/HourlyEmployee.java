package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;

   public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }
    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        setRate(rate);
        setHours(hours);
    }
    //business methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid rate: "+ getRate());
    }

    @Override
    public void payTaxes() {
        double taxes =(getRate() * getHours()) * TaxPayer.HOURLY_TAX_RATE;
        System.out.println(getName() + " paid tax amount: " + taxes );
    }


    //getter setters
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() + "Employee: name=" + getName() + ", hireDate= " + getHireDate() +
                ", rate=" + getRate();
    }
}