// Student name :       Rachel O Shea
// Student ID :         C00248457
// Date :               21/10/25
// Purpose :            Test understanding of concepts of classes and inheritance

public class Point
{

protected int x;
protected int y;


public Point ()                     // Default constructor
{
    setX(0);
    setY(0);
}

public Point (int x, int y)         // Parameterised constructor
{
    this.x = x;
    this.y = y;
}

public void setX(int x)             // Setter method
{
    this.x = x;
}

public void setY(int y)             // Setter method
{
    this.x = y;
}

public int getX()                   // Getter method
{
    return x;
}

public int getY()                   // Getter method
{
    return y;
}

public String toString()            // To String method
{
    return "(" + x + ", " + y +")";
}

}