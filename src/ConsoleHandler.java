import java.util.Scanner;
import java.util.StringTokenizer;

public class ConsoleHandler {

    public static final String PRICE = "price";
    public static final String QUANTITY = "quantity";
    public static final String NAME = "name";
    public static final String TYPE = "type";

    public Item userInputForItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the details below for item name, price, quantity and type " +
                            "(type =raw, manufactured or imported.");
        String input = scanner.next();
        StringTokenizer tokenizer = new StringTokenizer(input, "-");
        String type = null;
        String name = null;
        int price = 0;
        int quantity = 0;

        while(tokenizer.hasMoreElements()) {
            String token = tokenizer.nextToken();
            if(token.contains(NAME)) {
                String[] temps = token.trim().split(" ");
                name = temps[1];
            } else if(token.contains(PRICE)) {
                String[] temps = token.trim().split(" ");
                price = Integer.parseInt(temps[1]);
            } else if(token.contains(QUANTITY)) {
                String[] temps = token.trim().split(" ");
                quantity = Integer.parseInt(temps[1]);
            } else if(token.contains(TYPE)) {
                String[] temps = token.trim().split(" ");
                type = temps[1];
            }

        }

        Item item = null;
        if(type.equalsIgnoreCase(ImportedItem.IMPORTED)) {
            item = new ImportedItem(name, price, quantity);
        } else if(type.equalsIgnoreCase(RawItem.RAW)) {
            item = new RawItem(name, price, quantity);
        } else if (type.equalsIgnoreCase(ManufacturedItem.MANUFACTURED)) {
            item = new ManufacturedItem(name, price, quantity);
        }
        return item;

}


    public void printOnConsole(Item item){
        System.out.println(item.toString());
    }

}
