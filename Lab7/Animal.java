// Student Name :       Rachel O Shea
// Student Number :     C00248457
// Date :               11/11/2025
// Purpose :            Lab 7 - Test understanding of inheritance and polymorphism

public class Animal
{

    private String name;            // Instance variable

    public Animal(String name)      // Constructor parameterised with name
    {
        this.name = name;
    }

    public String getName()         // Getter method for name
    {
        return name;
    }

    public String toString()        // toString method
    {
        return "Animal Name: " + name;
    }

}