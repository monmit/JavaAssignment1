public class Calculation {

    final double ratePercent = (12.5/100);
    private double finalPrice, rawTax, manufacturedTax, importedTax;


    public double calculateTaxLiability(Test2 test) {
        if (test.getType().toLowerCase().equals("raw")) {
            rawTax = (ratePercent * (test.getPrice() * test.getQuantity()));
            finalPrice = test.getPrice() + rawTax;
        } else if (test.getType().toLowerCase().equals("manufactured")) {
            manufacturedTax = ((ratePercent * (test.getPrice() * test.getQuantity()))) +
                    (2 * (test.getPrice() + (ratePercent * (test.getPrice() * test.getQuantity())))/100);
            finalPrice = test.getPrice() + manufacturedTax;
        } else if (test.getType().toLowerCase().equals("imported")) {
            double tax = ((10 * test.getPrice()/100));
            finalPrice = test.getPrice() + tax;
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

    public double getFinalPrice() {
        return finalPrice;
    }
    public double getRawTax() {
        return rawTax;
    }
    public double getManufacturedTax() {
        return manufacturedTax;
    }
    public double getImportedTax() {
        return importedTax;
    }


}
