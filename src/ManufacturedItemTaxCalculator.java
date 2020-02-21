public class ManufacturedItemTaxCalculator extends TaxCalculator {
    final double ratePercent = (12.5 / 100);
    private double finalPrice;

    public void calculateTaxLiability(Item item) {
            double tax = ((ratePercent * (item.getPrice() * item.getQuantity()))) +
                    (2 * (item.getPrice() + (ratePercent * (item.getPrice() * item.getQuantity())))/100);
            finalPrice = item.getPrice() + tax;
        }
    }

