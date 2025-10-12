// Driver program to fully test BankCustomer methods
public class BankCustomerTest {
    public static void main(String[] args) {
        // Create a BankCustomer
        BankCustomer customer = new BankCustomer("Alice Smith", "123 Main St");

        // Add three SavingsAccounts
        SavingsAccount acc1 = new SavingsAccount(1000.0);
        SavingsAccount acc2 = new SavingsAccount(2500.0);
        SavingsAccount acc3 = new SavingsAccount(500.0);

        customer.addAccount(acc1);
        customer.addAccount(acc2);
        customer.addAccount(acc3);

        // Try to add a fourth account (should print warning)
        SavingsAccount acc4 = new SavingsAccount(300.0);
        customer.addAccount(acc4);

        // Print summary
        customer.summary();

        // Print total balance
        System.out.println("Total balance: " + customer.balance());

        // Print customer info
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Customer Address: " + customer.getCustomerAddress());
        System.out.println("Customer ID: " + customer.getCustomerID());
    }
}
