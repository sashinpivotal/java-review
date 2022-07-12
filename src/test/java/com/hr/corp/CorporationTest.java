package com.hr.corp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CorporationTest {

    @Test
    public void computeMonthlyTaxToPay() {

        Corporation myCompany = new Corporation("MyCompany", 10_000.0);
        double monthlyTaxToPay = myCompany.computeMonthlyTaxToPay();
        Assert.assertEquals(1000.0, monthlyTaxToPay, 0.01);
    }
}