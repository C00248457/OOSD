// Student Name :       Rachel O Shea
// Student Number :     C00248457
// Date :               11/11/2025
// Purpose :            Lab 7 - Test understanding of inheritance and polymorphism

public class Driver
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Rocky");            // Create Dog object
        Cat cat1 = new Cat("Lulu");             // Create Cat object

        Vet vet = new Vet("Dr. Dolittle");      // Create Vet object

        vet.Vaccinate(dog1);                          // Call method for dog
        vet.Vaccinate(cat1);                          // Call method for cat
    }
}