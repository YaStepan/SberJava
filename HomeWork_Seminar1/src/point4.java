import java.util.Scanner;

public class point4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int SECONDS_PER_MINUTE = 60;
        int MINUTES_PER_HOUR = 60;
        int HOUR_PER_DAY = 24;
        int SECONDS_PER_DAY = SECONDS_PER_MINUTE*MINUTES_PER_HOUR*HOUR_PER_DAY;
        int totalSeconds = input.nextInt();
        int todaySeconds = totalSeconds>SECONDS_PER_DAY?totalSeconds%SECONDS_PER_DAY:totalSeconds;
        int todayMinutes = todaySeconds/SECONDS_PER_MINUTE;
        int currentMinute = todayMinutes%MINUTES_PER_HOUR;
        int currentHour = todayMinutes/MINUTES_PER_HOUR;
        System.out.printf("Current time: %s hours %s minutes",currentHour,currentMinute);

    }
}
