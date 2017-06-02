import java.util.Scanner;

public class p03CarToGo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        String season = console.nextLine().toLowerCase();

        double spentBudget;

        if (budget <= 100) {
            switch (season) {
                case "summer":
                    spentBudget = budget * 35.0 / 100;
                    System.out.printf("Economy class%nCabrio - %.2f", spentBudget);
                    break;
                case "winter" :
                    spentBudget = budget*65.0/100;
                    System.out.printf("Economy class%nJeep - %.2f", spentBudget);
            }
        } else if (budget > 100 && budget <=500) {
            switch (season) {
                case "summer":
                    spentBudget = budget * 45.0 / 100;
                    System.out.printf("Compact class%nCabrio - %.2f", spentBudget);
                    break;
                case "winter" :
                    spentBudget = budget*80.0/100;
                    System.out.printf("Compact class%nJeep - %.2f", spentBudget);
            }
        } else {
            spentBudget = budget * 90.0 / 100;
            System.out.printf("Luxury class%nJeep - %.2f", spentBudget);
        }
    }
}
