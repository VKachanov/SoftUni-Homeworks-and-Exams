import java.util.Scanner;

public class p03TruckDriver {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String season = console.nextLine().toLowerCase();
        double kmPerMonth = Double.parseDouble(console.nextLine());

        double moneyPerSeason = 0;

        switch (season) {
            case "spring":
            case "autumn":
                if (kmPerMonth <= 5000) {
                    moneyPerSeason = kmPerMonth * 0.75 * 4;
                } else if ( kmPerMonth > 5000 && kmPerMonth <= 10000) {
                    moneyPerSeason = kmPerMonth * 0.95 * 4;
                } else if (kmPerMonth > 10000 && kmPerMonth <=20000) {
                    moneyPerSeason = kmPerMonth * 1.45 * 4;
                }
                break;
            case "summer" :
                if (kmPerMonth <= 5000) {
                    moneyPerSeason = kmPerMonth * 0.90 * 4;
                } else if ( kmPerMonth > 5000 && kmPerMonth <= 10000) {
                    moneyPerSeason = kmPerMonth * 1.10 * 4;
                } else if (kmPerMonth > 10000 && kmPerMonth <=20000) {
                    moneyPerSeason = kmPerMonth * 1.45 * 4;
                }
                break;
            case "winter" :
                if (kmPerMonth <= 5000) {
                    moneyPerSeason = kmPerMonth * 1.05 * 4;
                } else if ( kmPerMonth > 5000 && kmPerMonth <= 10000) {
                    moneyPerSeason = kmPerMonth * 1.25 * 4;
                } else if (kmPerMonth > 10000 && kmPerMonth <=20000) {
                    moneyPerSeason = kmPerMonth * 1.45 * 4;
                }
                break;
        }
        double moneyAfterTax = moneyPerSeason - moneyPerSeason * 10 /100;
        System.out.printf("%.2f", moneyAfterTax);
    }
}
