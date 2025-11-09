// Student name : 		Rachel O Shea
// Student number : 	C00248457
// Date : 				04/11/2025
// Purpose : 			OOSD Lab 6 - Teacher Class

public class Teacher extends Person
{
    private int numCourses = 0;
    private String[] courses = new String[6];
    private int index = 0;

    public Teacher(String name, String address)
    {
        super(name, address);
    }

    public String toString()
    {
        String result;

        result = "Teacher: " + getName() + "(" + getAddress() + ")";

        return result;
    }

    public boolean addCourse(String course)
    {
        for(index = 0; index < numCourses; index++)
        {
            if(courses[index].equals(course))
            {
                return false;
            }

            else if(numCourses >= courses.length)
            {
                return false;
            }
        }

        courses[numCourses] = course;
        numCourses++;
        return true;
    }

    public boolean removeCourse(String course)
    {
        int innerIndex = 0;

        for(index = 0; index < numCourses; index++)
        {
            if(courses[index].equals(course))
            {
                for (innerIndex = index; innerIndex < numCourses - 1; innerIndex++)
                {
                    courses[innerIndex] = courses[innerIndex + 1];
                }

                courses[numCourses-1] = null;
                numCourses--;
                return true;
            }
        }

        return false;
    }
}