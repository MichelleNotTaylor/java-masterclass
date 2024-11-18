package model;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired = true;

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void retire() {
        isRetired = true;
        terminate(LocalDate.now());
    }

    @Override
    public double collectPay() {
        return (int) annualSalary/26;
    }
}
