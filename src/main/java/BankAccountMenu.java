import java.text.NumberFormat;
import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        boolean isRunning = true;
        double balance = 0.0;

        while (isRunning) {
            System.out.println("--- Bank Account Menu ---");
            System.out.println("1. Add Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int userChoice = scan.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.print("Enter amount to add: ");
                    double toAdd = scan.nextDouble();

                    if (toAdd > 0) {
                        balance += toAdd;
                        System.out.println("Added " + money.format(toAdd));
                        System.out.println("New balance: " + money.format(balance));
                    }
                    else {
                        System.out.println("ERROR");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double toWithdraw = scan.nextDouble();

                    if (toWithdraw > 0 && toWithdraw < balance) {
                        balance -= toWithdraw;
                        System.out.println("Withdrew " + money.format(toWithdraw));
                        System.out.println("New balance: " + money.format(balance));
                    }
                    else {
                        System.out.println("ERROR");
                    }
                    break;

                case 3:
                    System.out.println("Current Balance: " + money.format(balance));
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    isRunning = false;
            }
        }
    }
}
