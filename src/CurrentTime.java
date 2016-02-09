import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int timezone = input.nextInt();
        
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = (totalMilliseconds / 1000) 
                + (timezone * 60 * 60);
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        
        System.out.println("Current time is " + currentHour + 
                ":" + currentMinute + ":" + currentSecond + " GMT");
    } // main
} // CurrentTime
