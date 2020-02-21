public class ImportedTaxCalculator extends TaxCalculator {
    private double finalPrice;

    public void calculateTaxLiability(Item item) {
            double tax = ((10 * item.getPrice()/100));
            finalPrice = item.getPrice() + tax;
            double surcharge = surchargeCalculationOnImportedType(finalPrice);
            finalPrice = finalPrice + surcharge;
        }
    private double surchargeCalculationOnImportedType(double finalPrice) {
        double surcharge = 0.0;
        if (finalPrice <= 100) {
            surcharge = 5;
        } else if (finalPrice > 100 && finalPrice <= 200) {
            surcharge = 10;
        } else if (finalPrice > 200) {
            surcharge = ((5 * finalPrice) / 100);
        }
        return surcharge;
    }

}
