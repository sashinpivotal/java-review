package gov.irs;

public interface TaxPayer {
    static final double HOURLY_TAX_RATE = 0.25;
    static final double SALARIED_TAX_RATE = 0.30;
    static final double CORP_TAX_RATE = 0.10;

    double computeMonthlyTaxToPay();
}
