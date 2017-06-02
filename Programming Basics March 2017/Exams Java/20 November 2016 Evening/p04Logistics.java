import java.util.Scanner;

public class p04Logistics {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int loadsCount = Integer.parseInt(console.nextLine());

        int microbus = 0;
        int truck = 0;
        int train = 0;
        int totalWeight = 0;

        for (int i = 0; i < loadsCount; i++) {
            int loadWeight = Integer.parseInt(console.nextLine());

            if (loadWeight <= 3) {
                microbus += loadWeight;
                totalWeight += loadWeight;

            } else if (loadWeight >= 4 && loadWeight <= 11) {
                truck += loadWeight;
                totalWeight += loadWeight;

            } else {
                train += loadWeight;
                totalWeight += loadWeight;

            }
        }
        double averagePrice = (microbus * 200.0 + truck * 175 + train * 120) / totalWeight;

        System.out.printf("%.2f%n%.2f%%%n%.2f%%%n%.2f%%", averagePrice, microbus*100.0/totalWeight,
                truck * 100.0 / totalWeight, train * 100.0 / totalWeight);
    }
}
