package gov.irs;

public class IRS {

    private String location;

    private TaxPayer[] taxPayers = new TaxPayer[100];
    private int currentIndex = 0;

    public IRS(String location) {
        this.location = location;
    }

    public IRS(String location, TaxPayer[] taxPayers) {
        this.location = location;
        this.taxPayers = taxPayers;
    }

    public void register(TaxPayer taxPayer) {

        // - receive TaxPayer object as an argument
        // - place that TaxPayer object into the first empty bucket of the array
        taxPayers[currentIndex++] = taxPayer;
        // - increment the currentIndex so that next time this method is
        //   called, it will use the next empty bucket

    }

    public double computeTotalTaxToCollect() {

        double totalMonthlyTaxToCollect = 0.0;

        // - for every TaxPayer object in the array, call
        //   computeMonthlyTaxToPay() method
        // - add them up to totalMonthlyTaxToCollect variable

        for (int i = 0; i < currentIndex; i++) {
            double monthlyTaxToPay = taxPayers[i].computeMonthlyTaxToPay();
            totalMonthlyTaxToCollect += monthlyTaxToPay;
        }
        // - return it
        return totalMonthlyTaxToCollect;
    }
}
