public class ManufacturedItem extends Item {

    public static final String MANUFACTURED = "manufactured";
    final double ratePercent = (12.5 / 100);

    public ManufacturedItem(String name, int price, int quantity) {
        super(price, quantity, name, MANUFACTURED);
        calculateTaxLiability();
    }

    @Override
    public void calculateTaxLiability() {
        double tax = ((ratePercent * (getPrice() * getQuantity()))) +
                (2 * (getPrice() + (ratePercent * (getPrice() * getQuantity()))) / 100);
        setTax(tax);
    }
}


