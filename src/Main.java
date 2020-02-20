public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
    //Test1 test = new Test1();
        Test2 test2 = new Test2();
        test2.UserInputForItem();
        test2.calculateTaxLiability();
        test2.surchargeCalculation();
        test2.printOnConsole();
        System.out.println("success");
=======
    Test2 test2 = new Test2();
    Calculation calculate = new Calculation();
    PrintOnConsole print = new PrintOnConsole();
    test2.UserInputForItem();
    test2.setType("Raw");
    calculate.calculateTaxLiability();
    print.printOnConsole();
        System.out.println("Success");

>>>>>>> 2d989f607ee7bae5e602c63337c53fd1d387e015
    }
}
