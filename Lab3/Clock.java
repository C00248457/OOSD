// Student name:    Rachel O Shea
// Student number : C00248457
// Date :           07/10/2025
// Purpose :        Create a clock that displays the current time (and updates every second)

import java.util.Calendar;

public class Clock
{

public static void main (String args[])
    {
        long currentMillis;     // will not work as an int due to System.currentTimeMillis() returning a long
        long newMillis;
        int oldMinute;
        int newMinute;

        Calendar cal = Calendar.getInstance();
        Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));    // initialise a time object with the current hour and minute
        System.out.println(t.toString());

        currentMillis = System.currentTimeMillis(); // get current time in milliseconds
        newMillis = currentMillis;
        oldMinute = cal.get(Calendar.MINUTE); // get current minute
        newMinute = oldMinute;

        while(newMinute == oldMinute)
        {
            while ((newMillis-currentMillis) < 1000)             // wait one second
            {
                newMillis = System.currentTimeMillis();
            }

        t.tick();
        System.out.println(t.toString());

        newMinute = t.getMinute();
        currentMillis = System.currentTimeMillis();     //reset so the loop can go again
        newMillis = currentMillis;
        }
    }
}