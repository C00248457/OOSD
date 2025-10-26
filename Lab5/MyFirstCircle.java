// Student name :       Rachel O Shea
// Student ID :         C00248457
// Date :               24/10/25
// Purpose :            Test understanding of concepts of classes and inheritance


public class MyFirstCircle
{
    public static void main (String args[])
    {
        Point myPoint = new Point(10, 20);                         // Set details for myPoint
        Circle myCircle = new Circle(15, 30, 5);            // Set details for myCircle

        System.out.println("Point details : " + myPoint);
        System.out.println("Circle details: " + myCircle);
    }
}