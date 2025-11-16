// Student Name :       Rachel O Shea
// Student Number :     C00248457
// Date :               11/11/2025
// Purpose :            Lab 7 - Test understanding of inheritance and polymorphism

public class Vet
{

    private String name;        // Instance variable

    public Vet(String name)     // Constructor parameterised with name
    {
        this.name = name;      
    }

    public void Vaccinate(Animal animal)    // Insert Animal parameter
    {
        System.out.println(name + " is vaccinating.");

        if(animal instanceof Dog)           // Checks if animal is a dog
        {
            System.out.println("Dog has been vaccinated: " + animal.getName());
        }

        else if(animal instanceof Cat)     // Checks if animal is a cat
        {
            System.out.println("Cat has been vaccinated: " + animal.getName());
        }
    }
    
}
