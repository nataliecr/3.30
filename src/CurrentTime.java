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
        
        if (currentHour >= 13){
            currentHour = currentHour - 12;
        }
        
        if (currentHour == 0){
            currentHour = currentHour + 12;
        }
        
        System.out.print("Current time is " + currentHour + 
                ":" + currentMinute + ":" + currentSecond);
        
        if (currentHour < 12)
            System.out.println(" AM");
        else
            System.out.println(" PM");
    } // main
} // CurrentTime
