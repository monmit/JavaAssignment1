import java.util.Scanner;

public class Test1 {
    public String name;
    int price;
    int quantity;
    String type;
    double surcharge;
    double finalPrice;

    public boolean yesOrNo;
    private static double ratePercent = 12.5;

    public Test1(String name, int price, int quantity, String type) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
    }

    public boolean UserInputForItem() {
        while (yesOrNo = true) {
            Scanner scanner = new Scanner(System.in);
            name = scanner.next();
            System.out.println("-name<" + name + ">");
            price = scanner.nextInt();
            System.out.println("-price<" + price + ">");
            quantity = scanner.nextInt();
            System.out.println("-quantity<" + quantity + ">");
            type = scanner.next();
            System.out.println("-type<" + type + ">");
            System.out.println("Do you want to enter details of any other item (y/n)");
            yesOrNo = scanner.nextBoolean();
        }
        return yesOrNo;
    }

    public double calculateTaxLiability() {
        String raw = null;
        String manufactured = null;
        String imported = null;
        if (type == raw) {
            double rawTax = (ratePercent * (price * quantity)) / 100;
            finalPrice = price + rawTax;
        } else if (type == manufactured) {
            double manufacturedTax = ((ratePercent * (price * quantity)) / 100) + (2 * (price + (ratePercent * (price * quantity)) / 100)) / 100;
            finalPrice = price + manufacturedTax;
        } else if (type == imported) {
            double importedTax = ((10 * price) + surcharge);
            finalPrice = price + importedTax;
        }
        return finalPrice;
    }

    public double surchargeCalculation() {
        if (finalPrice <= 100) {
            surcharge = 5;
        } else if (finalPrice > 100 && finalPrice <= 200) {
            surcharge = 10;
        } else if (finalPrice > 200) {
            surcharge = ((5 * finalPrice) / 100);
        }
        return surcharge;
    }
    public void printOnConsole(){
        System.out.println(name);
        System.out.println(price);
        System.out.println(finalPrice);
        //System.out.println(Tax);
    }
}
