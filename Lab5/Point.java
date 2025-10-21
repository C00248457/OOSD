// Student name :       Rachel O Shea
// Student ID :         C00248457
// Date :               21/10/25
// Purpose :            Test understanding of concepts of classes and inheritance

public class Point
{

protected int x;
protected int y;


public Point ()
{
    setX(0);
    setY(0);
}

public Point (int x, int y)
{
    this.x = x;
    this.y = y;
}

public void setX(int x)
{
    this.x = x;
}

public void setY(int y)
{
    this.x = y;
}

public int getX()
{
    return x;
}

public int getY()
{
    return y;
}

public String toString()
{
    return "X : " + x + "Y : " + y;
}

}