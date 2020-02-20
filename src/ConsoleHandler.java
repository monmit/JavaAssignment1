import java.util.Scanner;

public class ConsoleHandler {

    public void UserInputForItem(Item item) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, Enter details below as asked.");
        System.out.print("name");
        item.setName(scanner.next().toLowerCase());
        System.out.print("price");
        item.setPrice(scanner.nextInt());
        System.out.print("quantity");
        item.setQuantity( scanner.nextInt());
        System.out.print("type (it can be Raw, Manufactured or Imported)");
        item.setType(scanner.next().toLowerCase());
    }

    public void printOnConsole(Item item, Calculation calculate){
        System.out.println(item.getName());
        System.out.println(item.getPrice());
        System.out.println(calculate.getFinalPrice()); // coz they don't have any getters abhi.
        System.out.println(calculate.getRawTax());
        System.out.println(calculate.getManufacturedTax());
        System.out.println(calculate.getImportedTax());
    }

    public void yesOrNo(){
    }
}
