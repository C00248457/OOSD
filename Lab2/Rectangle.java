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

    public Rectangle(double length, double width)
    {
        setLength(length);
        setWidth(width);
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

    public double getArea()
    {
        return length*width;
    }

    public double getPerimeter()
    {
        return 2* (length + width);
    }

    public void printRectangle()
    {
        int index;
        int index2;

        for (index2 = 0; index2 < length; index2 ++)
        {
            for (index = 0; index < width; index ++)
            {
                //Control printing so stars only delineate the edges and do not fill the box
                if (index == 0 || index == width-1)
                {
                    System.out.print("*");
                }
                
                else 
                {
                    if (index2 == 0 || index2 == length-1)
                    {
                        System.out.print("*");
                    }
                    else 
                    {
                        System.out.print(" ");
                    }
                }   

            }
            System.out.println();
        }
    }
}
