package com.hr.personnel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class DepartmentTest {

    private Department department;

    @Before
    public void setUp() throws Exception {
        department = new Department("marketing", "building2");
        SalariedEmployee jane = new SalariedEmployee("jane",
                LocalDate.of(2020, 1, 3),
                1000.0);
        department.addEmployee(jane);
    }

    @Test
    public void addEmployee_should_add_an_employee_correctly() {

        Employee[] employees = department.getEmployees();

        SalariedEmployee jane1 = new SalariedEmployee("jane",
                LocalDate.of(2020, 1, 3),
                1000.0);
        Assert.assertEquals(jane1.getName(), employees[0].getName());
        Assert.assertEquals(jane1, employees[0]);
    }

    @Test
    public void addEmployee_should_add_an_employee_correctly2() {
        int currentIndex = department.getCurrentIndex();

        SalariedEmployee jane1 = new SalariedEmployee("jane",
                LocalDate.of(2020, 1, 3),
                1000.0);
        department.addEmployee(jane1);

        int currentIndexAfterAddingANewEmployee = department.getCurrentIndex();
        Assert.assertEquals(currentIndex+1, currentIndexAfterAddingANewEmployee);
    }

    @Test
    public void letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int numberOfEmployeesWhoWorked = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        Assert.assertEquals(1, numberOfEmployeesWhoWorked);
    }
}