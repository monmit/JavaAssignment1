public class Calculation {

    final double ratePercent = (12.5/100);
    private double finalPrice, rawTax, manufacturedTax, importedTax;


    public double calculateTaxLiability(Item item) {
        if (item.getType().toLowerCase().equals("raw")) {
            rawTax = (ratePercent * (item.getPrice() * item.getQuantity()));
            finalPrice = item.getPrice() + rawTax;
        } else if (item.getType().toLowerCase().equals("manufactured")) {
            manufacturedTax = ((ratePercent * (item.getPrice() * item.getQuantity()))) +
                    (2 * (item.getPrice() + (ratePercent * (item.getPrice() * item.getQuantity())))/100);
            finalPrice = item.getPrice() + manufacturedTax;
        } else if (item.getType().toLowerCase().equals("imported")) {
            double tax = ((10 * item.getPrice()/100));
            finalPrice = item.getPrice() + tax;
            double surcharge = surchargeCalculationOnImportedType(finalPrice);
            finalPrice = finalPrice + surcharge;
        }
        return finalPrice;

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
