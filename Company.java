package com.employee;

public class Company {
    private String companyName;
    private int workingDaysPerMonth;
    private int maxWorkingHours;
    private int employeeWagePerHour;

    public Company() {
    }

    public Company(String companyName, int workingDaysPerMonth, int maxWorkingHours, int employeeWagePerHour) {
        this.companyName = companyName;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.maxWorkingHours = maxWorkingHours;
        this.employeeWagePerHour = employeeWagePerHour;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getWorkingDaysPerMonth() {
        return workingDaysPerMonth;
    }

    public void setWorkingDaysPerMonth(int workingDaysPerMonth) {
        this.workingDaysPerMonth = workingDaysPerMonth;
    }

    public int getMaxWorkingHours() {
        return maxWorkingHours;
    }

    public void setMaxWorkingHours(int maxWorkingHours) {
        this.maxWorkingHours = maxWorkingHours;
    }

    public int getEmployeeWagePerHour() {
        return employeeWagePerHour;
    }

    public void setEmployeeWagePerHour(int employeeWagePerHour) {
        this.employeeWagePerHour = employeeWagePerHour;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", workingDaysPerMonth=" + workingDaysPerMonth +
                ", maxWorkingHours=" + maxWorkingHours +
                ", employeeWagePerHour=" + employeeWagePerHour +
                '}';
    }
}
