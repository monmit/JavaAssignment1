public abstract class TaxCalculator {
    // is class ka object create nhi ho skta
    double ratePercent;
    private double finalPrice, taxLiability;

    abstract void calculateTaxLiability(Item item);
}
