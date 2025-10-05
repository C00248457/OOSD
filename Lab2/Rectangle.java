// Student Name: Rachel O Shea
// Student ID: C00248457

public class Rectangle {
    
    private double length;
    private double width;

    public Rectangle()
    {
        setLength(1);
        setWidth(1);
    }

    public void setLength(double lengthOf)
    {
        if (lengthOf > 0.0 && lengthOf <= 40.0)
        {
            length = lengthOf;
        }

        else 
        {
            System.out.println("One or more values are invalid.");
        }
    }

    public double getLength()
    {
        return length;
    }

    public void setWidth(double widthOf)
    {
        if (widthOf > 0.0 && widthOf <= 40.0)
        {
            width = widthOf;
        }

        else 
        {
            System.out.println("One or more values are invalid.");
        }
    }

    public double getWidth()
    {
        return width;
    }

    public String toString()
    {
        return "Length = " + length + ", Width = " + width;
    }
}
