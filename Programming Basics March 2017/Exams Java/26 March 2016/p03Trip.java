import java.util.Scanner;

public class p03Trip {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        String season = console.nextLine().toLowerCase();

        double spentBudget;

        if (budget <= 100) {
            switch (season) {
                case "winter":
                    spentBudget = budget * 70.0 / 100;
                    System.out.printf("Somewhere in Bulgaria%nHotel - %.2f", spentBudget);
                    break;
                case "summer":
                    spentBudget = budget * 30.0 / 100;
                    System.out.printf("Somewhere in Bulgaria%nCamp - %.2f", spentBudget);
                    break;
            }
        } else if (budget <= 1000) {
            switch (season) {
                case "winter":
                    spentBudget = budget * 80.0 / 100;
                    System.out.printf("Somewhere in Balkans%nHotel - %.2f", spentBudget);
                    break;
                case "summer":
                    spentBudget = budget * 40.0 / 100;
                    System.out.printf("Somewhere in Balkans%nCamp - %.2f", spentBudget);
                    break;
            }
        } else {
            spentBudget = budget * 90.0 / 100;
            System.out.printf("Somewhere in Europe%nHotel - %.2f", spentBudget);
        }
    }
}
