// Student name :       Rachel O Shea
// Student number :     C00248457
// Date :               14/10/25
// Purpose :            Test understanding of classes and aggregation

public class Office
{
    Employee [] countPeople = new Employee [2];
    private int officeNumber;
    private static int nextRoomNumber = 100;
    private static int numEmp = 0;
    private int maxPeople;

public Office()
{
    this.officeNumber = nextRoomNumber;
    nextRoomNumber++;
}

public int getEmp(int numEmp)
{
    numEmp++;
    return numEmp;
}


}