import java.util.Scanner;

public class Test2 {
    private double surcharge, finalPrice, rawTax, manufacturedTax, importedTax;

    public boolean yesOrNo;
    private static double ratePercent = 12.5;
    private String name, type;
    private int price, quantity;

     public boolean UserInputForItem() {
         while (yesOrNo = true) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("-name<" + scanner.next(name) + ">");
         System.out.println("-price<" + scanner.nextInt(price) + ">");
         System.out.println("-quantity<" + scanner.nextInt(quantity) + ">");
         System.out.println("-type<" + scanner.next(type) + ">");
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
                rawTax = (ratePercent * (price * quantity)) / 100;
                finalPrice = price + rawTax;
            } else if (type == manufactured) {
                manufacturedTax = ((ratePercent * (price * quantity)) / 100) + (2 * (price + (ratePercent * (price * quantity)) / 100)) / 100;
                finalPrice = price + manufacturedTax;
            } else if (type == imported) {
                importedTax = ((10 * price) + surcharge);
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
            System.out.println(rawTax);
            System.out.println(manufacturedTax);
            System.out.println(importedTax);
        }

    }

