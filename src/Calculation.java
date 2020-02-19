public class Calculation {

    final double ratePercent = (12.5/100);
    private double surcharge, finalPrice, rawTax, manufacturedTax, importedTax;
    //private String raw, manufactured, imported;

    Test2 test = new Test2();

    public double calculateTaxLiability() {
        if (test.getType().toLowerCase().equals("Raw")) {
            rawTax = (ratePercent * (test.getPrice() * test.getQuantity()));
            finalPrice = test.getPrice() + rawTax;
        } else if (test.getType().toLowerCase().equals("Manufactured")) {
            manufacturedTax = ((ratePercent * (test.getPrice() * test.getQuantity()))) +
                    (2 * (test.getPrice() + (ratePercent * (test.getPrice() * test.getQuantity())))/100);
            finalPrice = test.getPrice() + manufacturedTax;
        } else if (test.getType().toLowerCase().equals("Imported")) {
            importedTax = (10 * test.getPrice()/100);
            //importedTax = ((10 * test.getPrice()/100)+ surcharge);
            finalPrice = test.getPrice() + importedTax;
        }
        System.out.println(finalPrice);
        return finalPrice;

    }
    /*private double surchargeCalculationOnImportedType() {
        if (test.getType()== imported && finalPrice <= 100) {
            surcharge = 5;
        } else if (test.getType()== imported && (finalPrice > 100 && finalPrice <= 200)) {
            surcharge = 10;
        } else if (test.getType()== imported && finalPrice > 200) {
            surcharge = ((5 * finalPrice) / 100);
        }
        System.out.println(surcharge);
        return surcharge;
    }*/

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
