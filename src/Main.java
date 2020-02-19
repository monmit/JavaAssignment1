public class Main {
    public static void main(String[] args) {
    Test2 test2 = new Test2();
    Calculation calculate = new Calculation();
    PrintOnConsole print = new PrintOnConsole();
    test2.UserInputForItem();
    test2.setType("Raw");
    calculate.calculateTaxLiability();
    print.printOnConsole();
        System.out.println("Success");

    }
}
