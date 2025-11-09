// Student name : 		Rachel O Shea
// Student number : 	C00248457
// Date : 				04/11/2025
// Purpose : 			OOSD Lab 6 - Student Class

public class Student extends Person
{
    private int numCourses = 0;
    private String[] courses = new String[6];
    private int[] grades = new int[6];

    public Student (String name, String address) 
    {
        super(name, address);
    }

    public String toString()
    {
        String result;

        result = "Student: " + super.toString() + ") ";
        return result;
    }

    public void addCourseGrade(String course, int grade)
    {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    public void printGrades()
    {
        int index;

        String result = "Student: " + super.toString() + " ";

        for(index = 0; index < numCourses; index++)
        {
            result += (courses[index] + ": " + grades[index] + " ");
        }

        System.out.println(result);
    }

    public double getAverageGrade()
    {
        double total = 0;
        double average;
        int index;

        if(grades.length==0)
        {
            return 0;
        }

        for(index = 0; index < numCourses; index++)
        {
            total += grades[index];
        }

        average = total/numCourses;

        return average;
    }





}

