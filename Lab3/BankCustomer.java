// Student name:    Rachel O Shea
// Student number : C00248457
// Date :           09/10/2025
// Purpose :        Create class BankCustomer

public class BankCustomer 
{
    private String customerName;
    private String customerAddress;
    private int customerID;
    private static int newCustomerID = 1;
    private SavingsAccount[] savingsAccounts = new SavingsAccount[3];       // Array to hold up to 3 accounts - max 3 accounts
    private int accountCount = 0;

    public BankCustomer(String name, String address) 
    {
        this.customerName = name;
        this.customerAddress = address;
        this.customerID = newCustomerID++;
    }    

    // Checks if the customer can add another account

    public void addAccount(SavingsAccount account) 
    {
        if (accountCount >= 3) 
        {
            System.out.println("Cannot add: customer already has the maximum amount of accounts allowed");
            System.out.println();       // Added blank line to improve legibility
        } 
        else 
        {
            savingsAccounts[accountCount++] = account;
        }
    }

    // Compute the total savings

    public double balance() 
    {
        int i;
        double total = 0.0;
        for (i = 0; i < accountCount; i++) 
        {
            total += savingsAccounts[i].getAccountBalance();
        }
        return total;
    }

    // Print a summary of the accounts
    
    public void summary() 
    {
        int i;
        System.out.println("Summary for " + customerName + ":");
        System.out.println();
        for (i = 0; i < accountCount; i++) 
        {
            System.out.println("Account Number: " + savingsAccounts[i].getAccountNumber()
                + ", Balance: " + savingsAccounts[i].getAccountBalance());
        }
        System.out.println();    // Added blank line to improve legibility
        System.out.println("Total Savings: " + balance());
    }

    // Getter method for the custome's name

    public String getCustomerName() 
    {
        return customerName;
    }

    // Getter method for the customer's address

    public String getCustomerAddress() 
    {
        return customerAddress;
    }

    // Getter method for the customer's ID
    
    public int getCustomerID() 
    {
        return customerID;
    }
}