import java.util.Scanner;

public class p03BikeRace {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int juniorsCount = Integer.parseInt(console.nextLine());
        int seniorsCount = Integer.parseInt(console.nextLine());
        String traceType = console.nextLine().toLowerCase();

        double moneyRaised = 0;

        switch (traceType) {
            case "trail" :
                moneyRaised = juniorsCount * 5.50 + seniorsCount * 7;
                break;
            case "cross-country" :
                moneyRaised = juniorsCount * 8.0 + seniorsCount * 9.5;
                if (juniorsCount + seniorsCount >= 50) {
                    moneyRaised = moneyRaised - moneyRaised * 25 / 100;
                }
                break;
            case "downhill" :
                moneyRaised = juniorsCount * 12.25 + seniorsCount * 13.75;
                break;
            case "road" :
                moneyRaised = juniorsCount * 20.0 + seniorsCount * 21.50;
                break;
        }
        double charityMoney = moneyRaised - moneyRaised * 5 / 100;

        System.out.printf("%.2f", charityMoney);
    }
}
