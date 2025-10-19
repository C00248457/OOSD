// Student name :       Rachel O Shea
// Student number :     C00248457
// Date :               15/10/25
// Purpose :            Test understanding of classes and aggregation - Rudimentary HR System

public class Employee
{
    private static int empNum = 1000;
    private int newEmpNum;
    private String name;
    private Address address;
    private String empType;
    private Office office;


    public Employee(String name, Address address, String empType, Office office)
    {
        this.newEmpNum = Employee.empNum;
        Employee.empNum++;

        this.name = name;
        this.address = address;
        this.empType = empType;
        this.office = office;
    }

    public int getEmpNum()
    {
        return newEmpNum;
    }

    public String toString()
    {
        return name + ", Office: " + office.getRoomNum();
    }

    public String getName()
    {
        return name;
    }

    public Address getAddress()
    {
        return address;
    }

    public String getEmpType()
    {
        return empType;
    }

    public Office getOffice()
    {
        return office;
    }

}