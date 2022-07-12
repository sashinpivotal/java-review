package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{

    private int hoursWorkedInAMonth;
    private double hourlyRate;

    public HourlyEmployee(String name, LocalDate localDate, int hoursWorkedInAMonth, double hourlyRate) {
        setName(name);
        setLocalDate(localDate);
        this.hoursWorkedInAMonth = hoursWorkedInAMonth;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String getEmployeeInfo() {
        return "name = " + getName() +
                "hireDate = " + getLocalDate() +
                "hourlyRate = " + getHourlyRate() +
                "hoursWorkedPerMonth = " + getHoursWorkedInAMonth();
    }

    @Override
    public double computeMonthlyCompensation() {
        return hoursWorkedInAMonth * hourlyRate;
    }

    public int getHoursWorkedInAMonth() {
        return hoursWorkedInAMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}
