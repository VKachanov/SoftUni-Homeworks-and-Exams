import java.util.Scanner;

public class p03Vacation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        String season = console.nextLine().toLowerCase();

        double spentBudget = 0;
        String acomodation = "";
        String destination = "";

        if (budget <=1000) {
            acomodation = "Camp";
            switch (season) {
                case "summer" :
                    destination = "Alaska";
                    spentBudget = budget * 65 / 100;
                    break;
                case "winter" :
                    destination = "Morocco";
                    spentBudget = budget * 45 / 100;
                    break;
            }
        } else if (budget > 1000 && budget <= 3000){
            acomodation = "Hut";
            switch (season) {
                case "summer" :
                    destination = "Alaska";
                    spentBudget = budget * 80 / 100;
                    break;
                case "winter" :
                    destination = "Morocco";
                    spentBudget = budget * 60 / 100;
                    break;
            }
        } else if (budget > 3000) {
            acomodation = "Hotel";
            switch (season) {
                case "summer" :
                    destination = "Alaska";
                    spentBudget = budget * 90 / 100;
                    break;
                case "winter" :
                    destination = "Morocco";
                    spentBudget = budget * 90 / 100;
                    break;
            }
        }
        System.out.printf("%s - %s - %.2f", destination, acomodation, spentBudget);
    }
}
