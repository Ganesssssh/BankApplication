import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an account and associate it with a customer
        Account account = new Account("100001003369", 10000.0, "Savings");
        Customer customer = new Customer("Ganesh", 133, account);

        // Display welcome message
        System.out.println("Welcome to the Bank App");
        System.out.println("Customer: " + customer.getName());

        // Display menu options
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");// exception
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;
                case 4:
                    account.displayTransactionHistory();
                    break;
                case 5:
                    System.out.println("Thank you for using the Bank App.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 5);


    }
}