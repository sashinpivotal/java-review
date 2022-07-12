package com.hr.personnel;

import java.util.Arrays;
import java.util.Objects;

public class Department {

    private String name;
    private String location;
    private Employee[] employees = new Employee[100];
    private int currentIndex = 0;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void addEmployee(Employee employee) {
        employees[currentIndex++] = employee;
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int employeesWhoWorked = 0;

//        for (Employee employee : employees) {
        for (int i = 0; i < currentIndex; i++) {
            String work = employees[i].work();
//            String work = employee.work();
            if (work.contains("worked")) {
                employeesWhoWorked++;
            }
        }

        return employeesWhoWorked;
    }

    public double computeDepartmentMonthlyTotalCompensation() {
        double departmentTotalMonthlyCompensation = 0.0;

        for (int i = 0; i < currentIndex; i++) {
            System.out.println("employee class = " + employees[i].getClass());
            double monthlyCompensation = employees[i].computeMonthlyCompensation();
            departmentTotalMonthlyCompensation += monthlyCompensation;
        }
        return departmentTotalMonthlyCompensation;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }



}
