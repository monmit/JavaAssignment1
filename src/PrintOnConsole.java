public class PrintOnConsole {
    Test2 test = new Test2();
    Calculation calculation = new Calculation();
    public void printOnConsole(){
        System.out.println(test.getName());
        System.out.println(test.getPrice());
        System.out.println(calculation.getFinalPrice());
        System.out.println(calculation.getRawTax());
        System.out.println(calculation.getManufacturedTax());
        System.out.println(calculation.getImportedTax());
    }

}
