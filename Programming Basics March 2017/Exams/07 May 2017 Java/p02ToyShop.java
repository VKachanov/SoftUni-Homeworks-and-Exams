import java.util.Scanner;

public class p02ToyShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double tripPrice = Double.parseDouble(console.nextLine());
        int puzzlesCount = Integer.parseInt(console.nextLine());
        int dollsCount = Integer.parseInt(console.nextLine());
        int stuffedBearsCount = Integer.parseInt(console.nextLine());
        int minionsCount = Integer.parseInt(console.nextLine());
        int toyTrucksCount = Integer.parseInt(console.nextLine());

        double profit = 0;
        int allToysCount = puzzlesCount + dollsCount + stuffedBearsCount + minionsCount + toyTrucksCount;

        if (allToysCount < 50) {
            profit = puzzlesCount * 2.60 + dollsCount * 3.0 + stuffedBearsCount * 4.10 + minionsCount * 8.20
                    + toyTrucksCount * 2.0;
        } else {
            profit = (puzzlesCount * 2.60 + dollsCount * 3.0 + stuffedBearsCount * 4.10 + minionsCount * 8.20
                    + toyTrucksCount * 2.0) - (puzzlesCount * 2.60 + dollsCount * 3.0 + stuffedBearsCount * 4.10 + minionsCount * 8.20
                    + toyTrucksCount * 2.0) * 25.0 / 100;
        }

        double profitAfterRent = profit - profit * 10.0 / 100;
        double diff = tripPrice - profitAfterRent;

        if (diff <=0 ) {
            System.out.printf("Yes! %.2f lv left.", Math.abs(diff));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
