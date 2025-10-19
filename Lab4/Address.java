// Student Name :       Rachel O Shea
// Student Number :     C00248457
// Date :               15/10/2025
// Purpose :            Test understanding of classes and aggregation - Rudimentary HR System

public class Address
{

private String street;
private String city;
private String county;

public Address()
{
    setStreet("Default");
    setCity("Default");
    setCounty("Default");
}

public Address (String street, String city, String county)      // Initialised with parameterised constructor
{
    this.street = street;                                       //Used to differentiate between instance variable and local variable
    this.city = city;
    this.county = county;
}

public String toString()                                        // Return values of string, city and county to driver
{
    return street + ", " + city + ", " + county + ".";
}

public void setStreet(String street)                            // Set street
{
    this.street = street;
}

public String getStreet()                                       // Get street
{
    return street;
}

public void setCity(String city)                                // Set city
{
    this.city = city;
}

public String getCity()                                         // Get city
{
    return city;
}

public void setCounty(String county)                            // Set county
{
    this.county = county;
}

public String getCounty()                                       // Get county
{
    return county;
}
}