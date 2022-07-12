package com.hr.personnel;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class HourlyEmployeeTest {

    @Test
    public void computeMonthlyTaxToPay() {
        HourlyEmployee kane = new HourlyEmployee("kane",
                LocalDate.of(2020, 2, 3),
                20,
                10.0);
        double monthlyTaxToPay = kane.computeMonthlyTaxToPay();
        Assert.assertEquals(50.0, monthlyTaxToPay, 0.01);
    }
}