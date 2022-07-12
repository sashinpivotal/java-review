package gov.irs;

import com.hr.corp.Corporation;
import com.hr.personnel.SalariedEmployee;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class IRSTest {

    @Test
    public void register() {
    }

    @Test
    public void computeTotalTaxToCollect_should_compute_total_value_correctly_with_2_employees_and_1_corp() {

        // - what is our test target class? IRS
        // - you have to create an object of your test target
        IRS irs = new IRS("USA");

        // - add 3 TaxPayer objects - one SalariedEmployee, one HourlyEmployee, one Corp
        SalariedEmployee kane = new SalariedEmployee("kane",
                LocalDate.of(2020, 1, 3),
                1000.0);
        irs.register(kane);
        Corporation myCompany = new Corporation("MyCompany", 10000.0);
        irs.register(myCompany);

        // - you are going to invoke the test target's method
        double totalTaxToCollect = irs.computeTotalTaxToCollect();

        //   and get the return value and assign to actual value
        // - you need to compute expected value
        double expectedTaxToCollect = 1300.0;

        // - assert
        Assert.assertEquals(expectedTaxToCollect, totalTaxToCollect, 0.01);
    }
}