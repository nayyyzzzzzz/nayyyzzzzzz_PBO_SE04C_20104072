package com.naiii.modul08.percobaan;

public class salary extends employee{
    private double annualSalary;

    public salary(String name, String address, int number, int salary) {
        super(name, address, number);
        this.annualSalary = salary;
    }

    public salary(String name, String address, int number) {
        super(name, address, number);
    }

    public void checkMail(){
        System.out.println("Checking mails for " + getName());
        System.out.println("With annual salary of $" +annualSalary);
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double newSalary) {
        if (newSalary >= 0)
            this.annualSalary = newSalary;
        else
            System.out.println("Error: Negative salary is not allowed!");
    }
    public double computerSalary(){
        System.out.println("Calculating salary for " + getName() + "...");
        return annualSalary / 52;
    }
}