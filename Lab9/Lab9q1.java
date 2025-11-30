// Student Name : Rachel O Shea
// Student ID : C00248457
// Date : 28/11/2025
// Purpose : Lab 9 - Test understanding of interfaces and inheritance in Java

public class Lab9q1
{
    public static void main(String[] args)
    {
        LoanItem[] items = new LoanItem[2];                         // Create array of LoanItem objects

        items[0] = new Book ("Book", "Horror073", "Mary Shelley", "Frankenstein", 554);
        items[1] = new CD ("CD", "Music256", "Fleetwood Mac", "The Chain", 4);

        System.out.println(items[0].calculatePrice());              // Call calculatePrice method for each object in array
        System.out.println(items[1].calculatePrice());              // Call calculatePrice method for each object in array
    }
}