import java.util.Scanner;

public class Test2 {

    //public boolean yesOrNo;
    private String name;
    private String type;
    private String answer;
    private int price, quantity;

    public void UserInputForItem() {
        //while (yesOrNo = true) {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter item name below");
            name = scanner.next().toLowerCase();
            System.out.println("-name<" + name + ">");
            System.out.println("Enter item price below");
            price = scanner.nextInt();
            System.out.println("-price<" + price + ">");
            System.out.println("Enter item quantity below");
            quantity = scanner.nextInt();
            System.out.println("-quantity<" + quantity + ">");
            System.out.println("Enter item type below: choose between: Raw, Manufactured or Imported");
            type = scanner.next().toLowerCase();
            System.out.println("-type<" + type + ">");
            System.out.println("Do you want to enter details of any other item (y/n)");
            answer = scanner.next().toLowerCase();
            //yesOrNo = scanner.nextBoolean();
        } while (answer.equals("Yes"));
        //return yesOrNo;
    }

      public String getName() {
          return name;
      }

      public String getType() {
          return type;
      }
      // type can be passed Raw, manufactured, imported.
      public void setType(String type) {
          this.type = type;
      }

      public int getPrice() {
          return price;
      }

      public int getQuantity() {
          return quantity;
      }

}