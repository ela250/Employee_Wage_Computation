package com.employee;
import java.util.List;
import java.util.ArrayList;

public class EmployeeWageBuilder {
    private Company company;
    private int totalEmployeeWage;
    private int totalHours;
    private int totalDays;
    private List<Integer> dailyWage = new ArrayList<>();

    public EmployeeWageBuilder() {
    }

    public EmployeeWageBuilder(Company company, int totalEmpWage, int totalHours, int totalDays) {
        this.company = company;
        this.totalEmployeeWage = totalEmployeeWage;
        this.totalHours = totalHours;
        this.totalDays = totalDays;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getTotalEmployeeWage() {
        return totalEmployeeWage;
    }

    public void setTotalEmployeeWage(int totalEmployeeWage) {
        this.totalEmployeeWage = totalEmployeeWage;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }

    public List<Integer> getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(List<Integer> dailyWage) {
        this.dailyWage = dailyWage;
    }

    @Override
    public String toString() {
        return "EmployeeWageBuilder{" +
                "company=" + company +
                ", totalEmployeeWage=" + totalEmployeeWage +
                ", totalHours=" + totalHours +
                ", totalDays=" + totalDays +
                ", dailyWage=" + dailyWage +
                '}';
    }
}
