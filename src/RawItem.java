public class RawItem extends Item {

    public static final String RAW = "raw";
    final double ratePercent = (12.5 / 100);

    public RawItem(String name, int price, int quantity) {
        super(price, quantity, name, RAW);
        calculateTaxLiability();
    }

    @Override
    public void calculateTaxLiability() {
        double tax = (ratePercent * (getPrice() * getQuantity()));
        setTax(tax);
    }

}
