import java.util.Scanner;

public class p02WorkHours {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int neededHours = Integer.parseInt(console.next());
        int workersCount = Integer.parseInt(console.next());
        int daysWork = Integer.parseInt(console.next());

        int executedWorkHours = workersCount*daysWork*8;

        int difference = neededHours - executedWorkHours;

        if (difference < 0) {
            System.out.printf("%d hours left", Math.abs(difference));
        } else {
            System.out.printf("%d overtime%nPenalties: %d", difference, difference*daysWork);
        }
    }
}
