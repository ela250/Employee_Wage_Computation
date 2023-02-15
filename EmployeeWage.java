package com.employee;
import java.util.Scanner;

public class EmployeeWage {
    private static final int FULL_DAY_HOUR = 8;
    private static final int PART_DAY_HOUR = 4;

    private static CompanyEmployeeWage companyEmployeeWage = new CompanyEmployeeWage();

    public static EmployeeWageBuilder computeEmployeeWage(Company company) {
        int days = 0;
        int employeeHours = 0;
        EmployeeWageBuilder employeeWageBuilder = new EmployeeWageBuilder();
        while (days < company.getWorkingDaysPerMonth() && employeeHours <= company.getMaxWorkingHours()) {
            int todayEmployeeWage = 0;
            days++;
            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (employeeCheck) {
                case 0:
                    todayEmployeeWage = FULL_DAY_HOUR;
                    break;
                case 1:
                    todayEmployeeWage = PART_DAY_HOUR;
                    break;
                case 2:
                    todayEmployeeWage = 0;
                    break;
            }
            employeeHours = employeeHours + todayEmployeeWage;
            employeeWageBuilder.getDailyWage().add(todayEmployeeWage * company.getEmployeeWagePerHour());
        }
        int totalEmployeeWage = employeeHours * company.getEmployeeWagePerHour();

        employeeWageBuilder.setCompany(company);
        employeeWageBuilder.setTotalHours(employeeHours);
        employeeWageBuilder.setTotalDays(days);
        employeeWageBuilder.setTotalEmployeeWage(totalEmployeeWage);
        companyEmployeeWage.getEmployeeWageBuilderList().add(employeeWageBuilder);
        return employeeWageBuilder;
    }

    public static void main(String[] args) {
        Company jio = new Company("Jio", 20, 60, 20);
        Company airtel = new Company("Airtel", 15, 80, 25);
        Company suzuki = new Company("Suzuki", 26, 180, 30);
        computeEmployeeWage(jio);
        computeEmployeeWage(airtel);
        computeEmployeeWage(suzuki);
        for (int i = 0; i < companyEmployeeWage.getEmployeeWageBuilderList().size(); i++) {
            System.out.println(companyEmployeeWage.getEmployeeWageBuilderList().get(i));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the company name to get details of wage: ");
        String companyName = scanner.nextLine();
        boolean isCompanyFound = false;
        for (int i = 0; i < companyEmployeeWage.getEmployeeWageBuilderList().size(); i++) {
            if (companyEmployeeWage.getEmployeeWageBuilderList().get(i).getCompany().getCompanyName().equals(companyName)) {
                System.out.println("Found company and here are the details");
                System.out.println(companyEmployeeWage.getEmployeeWageBuilderList().get(i));
                isCompanyFound = true;
                break;
            }
        }
        if (!isCompanyFound) {
            System.out.println("Not found any record with : " + companyName);
        }
    }
}
