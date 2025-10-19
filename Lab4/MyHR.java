// Student name :       Rachel O Shea
// Student number :     C00248457
// Date :               18/10/25
// Purpose :            Test understanding of classes and aggregation - Rudimentary HR System

import java.util.Scanner;

public class MyHR
{
   
    private static Office[] offices = new Office[3];            // Max 3 offices
    private static Employee[] employees = new Employee[5];      // Max 5 employees
    private static int numEmployees = 0;

    private static Scanner input = new Scanner(System.in);
    public static void main (String args[])
    {
        int index;
        boolean exit = false;
        int choice;
    
        for(index = 0; index < offices.length; index++)
        {
            offices[index] = new Office();
        }
        
        while(!exit)
        {
            System.out.println("Please select from the following options:");
            System.out.println("1. List all offices. ");
            System.out.println("2. Create a new employee record. ");
            System.out.println("3. List all employees. ");

            choice = input.nextInt();
            input.nextLine();
            
            switch(choice)
            {
                case 1: 
                    listOffices();
                    break;

                case 2:
                    createEmployee();
                    break;

                case 3:
                    listEmployees();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Invalid option, please select another number");
                
            }

        }

    input.close();

    }

    public static void listOffices()        // List employees
    {
        System.out.println("Offices: ");
        System.out.println();
        for(Office office : offices)
        {
            System.out.println(office.toString());
        }
    }

    public static void createEmployee()
    {
        String empType = "";
        int index;
        String name = "";
        String street;
        String city;
        String county;
        Address address = null;
        String carDetails = null;
        Office assignedOffice = null;

        if (numEmployees >= employees.length)    // Check if there's no room for a new employee
        {
            System.out.println("Cannot add employee, maximum number of employees reached. ");
        }

        else                                    // Continue by getting employee details
        {
            System.out.println("Enter employee's name : ");
            name = input.nextLine();                     // Using nextLine() instead of next so it reads both names and not just first
        
            System.out.println("Enter employee's address: ");
            street = input.nextLine();

            System.out.println("Enter employee's city/town : ");
            city = input.nextLine();
                
            System.out.println("Enter employee's county : ");
             county = input.nextLine();

            address = new Address (street, city, county);

            while (!empType.equalsIgnoreCase("Staff") && !empType.equalsIgnoreCase("Manager")) // Assign employee type and ensure to ignore case 
            {
                System.out.println("Enter employee type : ");
                empType = input.nextLine();
            }

            if(empType.equalsIgnoreCase("Manager"))
            {
                System.out.println("Enter the manager's car details");
                carDetails = input.nextLine();
            }

            while (assignedOffice == null)                      // Assign employee to an office
            {
                System.out.println("Assign employee to an office :");
        
                for (Office office : offices)
                {
                    System.out.println("Office " + office.getRoomNum() + " ( " + office.getEmpNum() + " employees )");
                }

                int chosenOffice = input.nextInt();
                input.nextLine();

                if(chosenOffice >= 100 && chosenOffice <= 102)
                {
                    Office office = offices[chosenOffice - 100];
                    if (office.getEmpNum() < 2)
                    {
                        assignedOffice = office;
                    }

                    else
                    {
                        System.out.println("Office is full. Please choose another.");
                    }
                }
            }
        }

        Employee newEmp;            // Create an employee object

        if(empType.equalsIgnoreCase("Manager"))
        {
            newEmp = new Manager (name, address, assignedOffice, carDetails);
        }

        else
        {
            newEmp = new Employee(name, address, empType, assignedOffice);
        }

        employees[numEmployees] = newEmp;
        numEmployees++;
        assignedOffice.addEmp(newEmp);

        System.out.println("New employee created : " + newEmp.getName());
    }

    private static void listEmployees()
    {
        int index;

        System.out.println("Employees :");
        if (numEmployees == 0)
        {
            System.out.println("No employees currently exist.");
        }

        else
        {
            for (index = 0; index < numEmployees; index ++)
            {
                System.out.println(employees[index].toString());
            }
        }
    }
}