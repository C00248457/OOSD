// Student Name :       Rachel O Shea
// Student Number :     C00248457
// Date :               09/10/2025
// Purpose :            Driver program to test BankCustomer methods

public class lab3q3 
{
    public static void main(String[] args) 
    {
        // Create an instance of BankCustoner to test 

        BankCustomer customer = new BankCustomer("John Smith", "Dublin");

        // Add three SavingsAccounts

        SavingsAccount acc1 = new SavingsAccount(1000.0);
        SavingsAccount acc2 = new SavingsAccount(2500.0);
        SavingsAccount acc3 = new SavingsAccount(500.0);

        customer.addAccount(acc1);
        customer.addAccount(acc2);
        customer.addAccount(acc3);

        // Try to add a fourth account (should print a warning - max three accounts)

        SavingsAccount acc4 = new SavingsAccount(300.0);
        customer.addAccount(acc4);

        // Print a summary

        customer.summary();

        // Print the total balance

        System.out.println("Total balance: " + customer.balance());
        System.out.println();

        // Print the customer info

        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Customer Address: " + customer.getCustomerAddress());
        System.out.println("Customer ID: " + customer.getCustomerID());
    }
}
