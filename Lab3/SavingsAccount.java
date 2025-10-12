// Student name:        Rachel O Shea
// Student number :     C00248457
// Date :               07/10/2025
// Purpose :            Create a savings account class

public class SavingsAccount
{

    private static int newAccountNumber = 1;             // variable used to keep track of account numbers
    private static double annualInterestRate = 0.0;

    private int accountNumber;
    private double savingsBalance;

    public SavingsAccount(double initialBalance)
    {
        this.savingsBalance = initialBalance;            // this. differentiates between an instance variable and a class variable
        this.accountNumber = newAccountNumber++; 
    }

    // Method to calculate the monthly interest

    public void calculateMonthlyInterest()
    {
        double monthlyInterest = savingsBalance * (annualInterestRate / 12);
        savingsBalance += monthlyInterest;
    }

    // Method to change the interest rate

    public static void modifyInterestRate(double newInterestRate)
    {
        annualInterestRate = newInterestRate;
    }

    // Getter method for account balance

    public double getAccountBalance()
    {
        return savingsBalance;
    }

    // Getter method for account number

    public int getAccountNumber()
    {
        return accountNumber;
    }
}