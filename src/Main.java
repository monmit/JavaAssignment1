public class Main {
    public static void main(String[] args) {
                Item item = new Item();
                Calculation calculate = new Calculation();
                calculate.calculateTaxLiability(item);
                ConsoleHandler inputOutput = new ConsoleHandler();
                inputOutput.UserInputForItem(item);
                inputOutput.printOnConsole(item, calculate);
                System.out.println("Success");

     }
}

