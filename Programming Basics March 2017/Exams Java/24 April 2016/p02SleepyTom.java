import java.util.Scanner;

public class p02SleepyTom {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int holyDays = Integer.parseInt(console.nextLine());

        int playTime = holyDays * 127 + (365 - holyDays) * 63;
        int difference = 30000 - playTime;
        int hours;
        int minutes;

        if (difference < 0) {
            hours = Math.abs(difference)/60;
            minutes = Math.abs(difference)%60;
            System.out.printf("Tom will run away%n%d hours and %d minutes more for play", hours, minutes);
        } else {
            hours = difference/60;
            minutes = difference%60;
            System.out.printf("Tom sleeps well%n%d hours and %d minutes less for play", hours, minutes);
        }
    }
}
