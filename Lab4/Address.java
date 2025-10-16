// Student Name :       Rachel O Shea
// Student Number :     C00248457
// Date :               15/10/2025
// Purpose :            Lab 4 - Rudimentary HR System

public class Address
{

private String street;
private String city;
private String county;


public Address (String street, String city, String county)
{
    this.street = street;
    this.city = city;
    this.county = county;
}

public String toString()
{
    return street + ", " + city + ", " + county + ".";
}

public void setStreet(String street)
{
    this.street = street;
}

public String getStreet()
{
    return street;
}

public void setCity(String city)
{
    this.city = city;
}

public String getCity()
{
    return city;
}

public void setCounty(String county)
{
    this.county = county;
}

public String getCounty()
{
    return county;
}
}