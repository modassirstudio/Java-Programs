package Practices;
import java.util.ArrayList;
import java.util.Scanner;

public class Basic_Banking_Program {
    // Account details stored in variables
    private static double balance = 1000.00; // Starting balance
    private static final int PIN = 1234;       // Default ATM PIN
    private static ArrayList<String> transactionHistory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== WELCOME TO THE JAVA BANK ATM ===");
        
        // 1. PIN Verification
        if (!verifyPin()) {
            System.out.println("Too many incorrect attempts. Card blocked. Exiting...");
            return;
        }

        // 2. Main Menu Loop
        boolean running = true;
        while (running) {
            showMenu();
            int choice = getIntInput("Choose an option (1-5): ");

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositFunds();
                    break;
                case 3:
                    withdrawFunds();
                    break;
                case 4:
                    viewTransactionHistory();
                    break;
                case 5:
                    System.out.println("\nThank you for using Java Bank ATM. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose a number between 1 and 5.");
            }
        }
        scanner.close();
    }

    // PIN Verification logic with 3 attempts
    private static boolean verifyPin() {
        int attempts = 3;
        while (attempts > 0) {
            int enteredPin = getIntInput("Please enter your 4-digit PIN: ");
            if (enteredPin == PIN) {
                return true;
            }
            attempts--;
            System.out.println("Incorrect PIN. Attempts remaining: " + attempts);
        }
        return false;
    }

    // Display the UI options
    private static void showMenu() {
        System.out.println("\n--- MAIN MENU ---");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Transaction History");
        System.out.println("5. Exit");
    }

    // Choice 1: Check Account Balance
    private static void checkBalance() {
        System.out.printf("\nYour current balance is: $%.2f\n", balance);
    }

    // Choice 2: Deposit Funds
    private static void depositFunds() {
        double amount = getDoubleInput("Enter the amount to deposit: $");
        if (amount <= 0) {
            System.out.println("Invalid amount. Deposit must be greater than $0.");
            return;
        }
        balance += amount;
        transactionHistory.add(String.format("Deposited: $%.2f", amount));
        System.out.printf("Successfully deposited $%.2f. New balance: $%.2f\n", amount, balance);
    }

    // Choice 3: Withdraw Funds
    private static void withdrawFunds() {
        double amount = getDoubleInput("Enter the amount to withdraw: $");
        if (amount <= 0) {
            System.out.println("Invalid amount. Withdrawal must be greater than $0.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds! Transaction canceled.");
            return;
        }
        balance -= amount;
        transactionHistory.add(String.format("Withdrew: $%.2f", amount));
        System.out.printf("Successfully withdrew $%.2f. Remaining balance: $%.2f\n", amount, balance);
    }

    // Choice 4: View Transaction Logs
    private static void viewTransactionHistory() {
        System.out.println("\n--- TRANSACTION HISTORY ---");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions found in this session.");
            return;
        }
        for (String record : transactionHistory) {
            System.out.println("- " + record);
        }
    }

    // Helper method to safely read integers and handle invalid character inputs
    private static int getIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid whole number.");
            }
        }
    }

    // Helper method to safely read doubles and handle invalid decimal character inputs
    private static double getDoubleInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid monetary value (decimal/number).");
            }
        }
    }
}
