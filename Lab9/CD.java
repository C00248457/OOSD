// Student Name : Rachel O Shea
// Student ID : C00248457
// Date : 28/11/2025
// Purpose : Lab 9 - Test understanding of interfaces and inheritance in Java

public class CD extends LibraryItem implements LoanItem                         // Declare CD class as subclass of LibraryItem and implement LoanItem interface
{
    private String band;
    private String title;
    private int numTracks;

    CD(String type, String ID, String band, String title, int numTracks)        // Constructor
    {
        this.type = type;
        this.ID = ID;
        this.band = band;
        this.title = title;
        this.numTracks = numTracks;
    }

    public double calculatePrice()                                              // Implement method from interface        
    {
        double price = numTracks * 1.05;
        return price;
    }
}