import java.util.Scanner;

public class p03MatchTickets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        String type = console.nextLine().toLowerCase();
        int peopleCount = Integer.parseInt(console.nextLine());

        double transportBudget = 0;

        if (peopleCount >= 1 && peopleCount <= 4) {
            transportBudget = budget * 75.0 / 100;
        } else if (peopleCount >= 5 && peopleCount <= 9) {
            transportBudget = budget * 60.0 / 100;
        }else if (peopleCount >= 10 && peopleCount <= 24) {
            transportBudget = budget * 50.0 / 100;
        }else if (peopleCount >= 25 && peopleCount <= 49) {
            transportBudget = budget * 40.0 / 100;
        }else if (peopleCount >= 50 ) {
            transportBudget = budget * 25.0 / 100;
        }
        double totalTicketPrice = 0;
        switch (type) {
            case "vip":
                totalTicketPrice = peopleCount*499.99;
                break;
            case "normal" :
                totalTicketPrice = peopleCount * 249.99;
        }

        double diference = budget - transportBudget - totalTicketPrice;

        if (diference >= 0 ) {
            System.out.printf("Yes! You have %.2f leva left.", diference);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(diference));
        }
    }
}
