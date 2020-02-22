package main.java.com.techstack.monica.assignment1.domain;

public class ImportedItem extends Item {

    public static final String IMPORTED = "imported";

    public ImportedItem(String name, int price, int quantity) {
        super(price, quantity, name, IMPORTED);
        calculateTaxLiability();
    }

    @Override
    public void calculateTaxLiability() {
        double tax = ((10 * getPrice()/100));
        double finalPrice = getPrice() + tax;
        double surcharge = surchargeCalculationOnImportedType(finalPrice);
        setTax(tax + surcharge);
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
