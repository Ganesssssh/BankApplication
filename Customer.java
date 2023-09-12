public class Customer {
    private String name;
    private int customerID;
    private Account account;

    public Customer(String name, int customerID, Account account) {
        this.name = name;
        this.customerID = customerID;
        this.account = account;
    }

    public void displayAccountInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Type: " + account.getAccountType());
        System.out.println("Account Balance: " + account.getBalance());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }
}