package com.hr.personnel;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {

    @Test
    public void computeMonthlyTaxToPay_should_return_correct_tax_value_based_on_tax_rate() {

        SalariedEmployee sang = new SalariedEmployee("sang",
                LocalDate.of(2020, 1, 3),
                1000.0);
        double monthlyTaxToPay = sang.computeMonthlyTaxToPay();
        Assert.assertEquals(300.0, monthlyTaxToPay, 0.01);
    }
}