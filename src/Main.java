import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConsoleHandler inputOutput = new ConsoleHandler();
        boolean run = true;
        while(run) {
            Item item = inputOutput.userInputForItem();
            inputOutput.printOnConsole(item);
            run = shouldRunAgain();
        }


     }

    private static boolean shouldRunAgain() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if(input.trim().equalsIgnoreCase("n")) {
            return false;
        } else {
            return true;
        }
    }
}
