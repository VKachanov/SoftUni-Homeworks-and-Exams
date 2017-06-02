import java.util.Scanner;

public class p02Harvest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int lozeArea = Integer.parseInt(console.nextLine());
        double grapeKgPerSqm = Double.parseDouble(console.nextLine());
        int neededWine = Integer.parseInt(console.nextLine());
        int numberWorkers = Integer.parseInt(console.nextLine());

        double totalUsableGrapeKg = lozeArea * grapeKgPerSqm * 40.0 / 100;
        double litersWineProduced = totalUsableGrapeKg / 2.5;
        double difference = neededWine - litersWineProduced;

        if (difference <= 0) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(litersWineProduced));
            double wineForWorkers = Math.abs(difference) / numberWorkers;
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(Math.abs(difference)), Math.ceil(wineForWorkers));
        } else if (difference > 0){
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(difference));
        }
    }
}

