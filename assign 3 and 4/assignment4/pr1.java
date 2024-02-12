/*1. Create a class called Time that has separate data member for hours, minutes and seconds. 
Define member functions to perform the following tasks:
to display the time in the format hh: mm: ss. 
to add times passed as arguments. 
to check which among two times passed as arguments is greater.
Write a program to test the class and its functions. Use constructor to initialize the instance 
variables of the class Time.*/

package assignment4;

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    
    public void displayTime() {
        
        System.out.println(hours+ " : "+minutes+" : "+seconds);
    }

    
    public Time addTime(Time otherTime) {
        int totalSeconds = this.seconds + otherTime.seconds;
        int newSeconds = totalSeconds % 60;
        int carryMinutes = totalSeconds / 60;

        int totalMinutes = this.minutes + otherTime.minutes + carryMinutes;
        int newMinutes = totalMinutes % 60;
        int carryHours = totalMinutes / 60;

        int newHours = this.hours + otherTime.hours + carryHours;

        return new Time(newHours, newMinutes, newSeconds);
    }

   
    public boolean isGreater(Time otherTime) {
        if (this.hours > otherTime.hours) {
            return true;
        } else if (this.hours == otherTime.hours && this.minutes > otherTime.minutes) {
            return true;
        } else if (this.hours == otherTime.hours && this.minutes == otherTime.minutes && this.seconds > otherTime.seconds) {
            return true;
        }

        return false;
    }
}

public class pr1 {
    public static void main(String[] args) {
        
        Time time1 = new Time(10, 30, 45);
        Time time2 = new Time(8, 45, 15);

        
        System.out.println("Time 1: ");
        time1.displayTime();

        System.out.println("Time 2: ");
        time2.displayTime();

        
        Time sumTime = time1.addTime(time2);
        System.out.println("\nSum of Time 1 and Time 2: ");
        sumTime.displayTime();

        
        if (time1.isGreater(time2)) {
            System.out.println("\nTime 1 is greater than Time 2.");
        } else if (time2.isGreater(time1)) {
            System.out.println("\nTime 2 is greater than Time 1.");
        } else {
            System.out.println("\nBoth times are equal.");
        }
    }
}



/* OUTPUT 
Time 1: 
10 : 30 : 45
Time 2: 
8 : 45 : 15

Sum of Time 1 and Time 2: 
19 : 16 : 0

Time 1 is greater than Time 2.
*/