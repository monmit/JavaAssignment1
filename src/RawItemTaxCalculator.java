public class RawItemTaxCalculator extends TaxCalculator{
    final double ratePercent = (12.5 / 100);
    private double finalPrice, taxLiability;
    @Override
    void calculateTaxLiability(Item item) {
        taxLiability = (ratePercent * (item.getPrice() * item.getQuantity()));
        finalPrice = item.getPrice() + taxLiability;
    }

}
