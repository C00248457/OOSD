// Student name :       Rachel O Shea
// Student ID :         C00248457
// Date :               21/10/25
// Purpose :            Test understanding of concepts of classes and inheritance

public class Circle extends Point
{
    private int radius;

public Circle(int x, int y, int radius)
{
    super(x,y);                                 // Calling the superclass constructor
    this.radius = radius;
}

public void setRadius(int radius)               // Setter method for radius
{
    this.radius = radius;
}

public int getRadius()                          // Getter method for radius
{
    return radius;
}

public String toString()                        // To String method
{
    return "(" + x + ", " + y + "), radius is " + radius;
}

}