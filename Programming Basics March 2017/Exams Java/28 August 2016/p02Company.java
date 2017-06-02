import java.util.Scanner;

public class p02Company {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int neededHours = Integer.parseInt(console.nextLine());
        int daysAvailable = Integer.parseInt(console.nextLine());
        int overtimersCount = Integer.parseInt(console.nextLine());

        double daysWork = daysAvailable - daysAvailable * 0.1;
        double hoursWork = Math.floor(daysWork * 8 + daysAvailable * overtimersCount * 2);

        double diff = hoursWork - neededHours;
        if (diff >= 0) {
            System.out.printf("Yes!%.0f hours left.", diff);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", Math.abs(diff));
        }
    }
}
