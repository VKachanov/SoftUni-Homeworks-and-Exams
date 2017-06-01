import java.util.Scanner;

public class p01AlcoholMarket {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double whiskeyPriceLv = Double.parseDouble(console.nextLine());
        double beerQuantityLr = Double.parseDouble(console.nextLine());
        double wineQuantityLr = Double.parseDouble(console.nextLine());
        double rakiaQuantityLr = Double.parseDouble(console.nextLine());
        double whiskeyQuantityLr = Double.parseDouble(console.nextLine());

        double rakiaPrice = whiskeyPriceLv / 2.0;
        double winePrice = rakiaPrice - rakiaPrice * 40.0 / 100;
        double beerPrice = rakiaPrice - rakiaPrice * 80.0 / 100;

        double totalSumNeeded = whiskeyPriceLv * whiskeyQuantityLr + beerPrice * beerQuantityLr + winePrice * wineQuantityLr
                + rakiaPrice * rakiaQuantityLr;

        System.out.printf("%.2f", totalSumNeeded);

    }
}
