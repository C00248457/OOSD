// Student name:    Rachel O Shea
// Student number : C00248457
// Date :           09/10/2025
// Purpose :        Test the SavingsAccount class

public class lab3q2
{
    public static void main(String[] args)
    {
        // Initialise two savings accounts objects
        
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Set interest rate to 4%

        SavingsAccount.modifyInterestRate(0.04);

        System.out.println("Balance of Savings Account 1 before interest: " + saver1.getAccountBalance());
        System.out.println("Balance of Savings Account 2 before interest: " + saver2.getAccountBalance());

        // Calculate monthly interest using created method

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Balance of Savings Account 1 after interest: " + saver1.getAccountBalance());
        System.out.println("Balance of Savings Account 2 after interest: " + saver2.getAccountBalance());

        // Change the interest rate to 5%

        SavingsAccount.modifyInterestRate(0.05);

        // Recalculate the monthly interest based on new figure

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Balance of Savings Account 1 after interest rate change: " + saver1.getAccountBalance());
        System.out.println("Balance of Savings Account 2 after interest rate change: " + saver2.getAccountBalance());
    }
}