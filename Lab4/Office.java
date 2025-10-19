// Student name :       Rachel O Shea
// Student number :     C00248457
// Date :               14/10/25
// Purpose :            Test understanding of classes and aggregation - Rudimentary HR System

public class Office
{
    Employee [] employees = new Employee [2];     // Stores two employees
    private int officeNumber;
    private static int nextOfficeNumber = 100;
    private int numEmp = 0;


public Office()
{
    officeNumber = nextOfficeNumber;
    nextOfficeNumber++;
    
    numEmp =0;
}

public void addEmp(Employee emp)                    // Add employee if there is enough space
{
    if (numEmp < 2)
    {
        employees[numEmp] = emp;
        numEmp++;
    }

    else
    {
        System.out.println("Office " + officeNumber + " is full. Cannot assign.");
    }
}

public int getEmpNum()
{
    return numEmp;
}

public String getEmpRecords()
{
    String records = "";
    int index;

    for(index = 0; index < numEmp; index++)
    {
        records = records + employees[index].toString();      // Return a string containing all records - separate to toString method in this class 
    }

    return records;
}


public int getRoomNum()
{
    return officeNumber;                          // Return value of room number to driver
}

public String toString()                            // Print to string the details of office number and the number of employees inside of it
{
    return officeNumber + " has " + numEmp + " employees ";
}

}