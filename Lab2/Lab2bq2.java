// Student Name: Rachel O Shea
// Student ID: C00248457

public class Lab2bq2
{

    public static void main (String [] args)
    {

        //Initialise default constructor and print to test
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);

        System.out.println("Area is " + rectangle1.getArea());
        System.out.println("Perimeter is " + rectangle1.getPerimeter());
        //Runs correctly as values fall within the requested value range

        System.out.println();
        //Line break for readability

        //Initalise with invalid values to test
        rectangle1.setLength(30);
        rectangle1.setWidth(45);

        System.out.println("Area is " + rectangle1.getArea());
        System.out.println("Perimeter is " + rectangle1.getPerimeter());
        //Invalid width value of 45, exceeds range. Will set default width back to 1, so 30*2 = 60, then 1*2 = 2. 60+2=62, therefore logic is followed
    }


}