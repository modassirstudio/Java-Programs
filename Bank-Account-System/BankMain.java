package Practices;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== WELCOME TO MODASSIR BANK =====");
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter initial deposit: ₹");
        double initial = sc.nextDouble();
        
        BankAccount account = new BankAccount(name, initial);
        
        int choice;
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    account.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    account.withdraw(sc.nextDouble());
                    break;
                case 3:
                    account.showBalance();
                    break;
                case 4:
                    account.showHistory();
                    break;
                case 5:
                    System.out.println("Thank you, " + account.getAccountHolder() + "!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        
        sc.close();
    }
}