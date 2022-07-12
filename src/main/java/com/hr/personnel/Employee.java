package com.hr.personnel;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Employee {

    private String name;
    private LocalDate localDate;


    public abstract String getEmployeeInfo();

    public String work() {
        return name + " worked";
    }

    public abstract double computeMonthlyCompensation();

    public String getName() {
        return name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(localDate, employee.localDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, localDate);
    }
}
