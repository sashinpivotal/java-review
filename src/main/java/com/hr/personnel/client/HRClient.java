package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
        Employee employee1
                = new SalariedEmployee("sang",
                LocalDate.of(2020, 4, 20), 3000.0);
        Employee employee2
                = new SalariedEmployee("mary",
                LocalDate.of(1999, 1, 3), 3000.0);
        Employee employee3
                = new HourlyEmployee("jon",
                LocalDate.of(2020, 1, 3),
                20, 10.0);

        Department department = new Department("engineering", "building1");
        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);

        int numberOfEmployeesWhoWorked
                = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        System.out.println("number = " + numberOfEmployeesWhoWorked);

        double monthlyTotalCompensation = department.computeDepartmentMonthlyTotalCompensation();
        System.out.println("total monthly compensation for this department = " + monthlyTotalCompensation);

    }
}
