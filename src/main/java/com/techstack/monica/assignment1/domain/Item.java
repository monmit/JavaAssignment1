package main.java.com.techstack.monica.assignment1.domain;

public abstract class Item {
    private int price;
    private int quantity;
    private double tax;
    private String name;
    private String type;

    public Item(int price, int quantity, String name, String type) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getFinalPrice() {
        return price + tax;
    }

    public abstract void calculateTaxLiability();

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", getFinalPrice=" + getFinalPrice() +
                ", tax=" + tax +
                '}';
    }
}
