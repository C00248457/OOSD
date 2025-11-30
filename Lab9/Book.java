// Student Name : Rachel O Shea
// Student ID : C00248457
// Date : 28/11/2025
// Purpose : Lab 9 - Test understanding of interfaces and inheritance in Java

public class Book extends LibraryItem implements LoanItem                   // Declare Book class as subclass of LibraryItem and implement LoanItem interface
{
    String author;
    String title;
    int numPages;

    Book(String type, String ID, String author, String title, int numPages) // Constructor
    {
        this.type = type;
        this.ID = ID;
        this.author = author;
        this.title = title;
        this.numPages = numPages;
    }

    public double calculatePrice()                                          // Implement method from interface
    {
        double price = numPages * 0.04;
        return price;
    }
}

