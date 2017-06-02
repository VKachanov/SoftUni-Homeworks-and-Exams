import java.util.Scanner;

public class p04SmartLilly {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int age = Integer.parseInt(console.nextLine());
        double loundryPrice = Double.parseDouble(console.nextLine());
        int toyPrice = Integer.parseInt(console.nextLine());

        int toyCount = 0;
        int cash = 0;
        int addCash = 10;
        int stolenMoney = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                cash += addCash;
                addCash += 10;
                stolenMoney++;
            } else {
                toyCount++;
            }
        }
        int totalMoney = cash - stolenMoney + toyCount*toyPrice;

        if (totalMoney >= loundryPrice) {
            System.out.printf("Yes! %.2f", totalMoney - loundryPrice);
        } else {
            System.out.printf("No! %.2f", loundryPrice - totalMoney);
        }
    }
}
