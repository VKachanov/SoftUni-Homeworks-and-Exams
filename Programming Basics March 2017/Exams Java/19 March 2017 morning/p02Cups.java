import java.util.Scanner;

public class p02Cups {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int neededCups = Integer.parseInt(console.nextLine());
        int workersCount = Integer.parseInt(console.nextLine());
        int daysWork = Integer.parseInt(console.nextLine());

        int workHours = workersCount * daysWork * 8;
        int cupsProduced = workHours / 5;

        double neededMoney = neededCups * 4.20;
        double acquiredMoney = cupsProduced * 4.20;
        double diff = neededMoney - acquiredMoney;

        if (diff > 0 ) {
            System.out.printf("Losses: %.2f", diff);
        } else {
            System.out.printf("%.2f extra money", Math.abs(diff));
        }
    }
}
