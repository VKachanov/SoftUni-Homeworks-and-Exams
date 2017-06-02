import java.util.Scanner;

public class p03Vacation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int adultsCount = Integer.parseInt(console.nextLine());
        int pupilsCount = Integer.parseInt(console.nextLine());
        int nightsCount = Integer.parseInt(console.nextLine());
        String transportType = console.nextLine().toLowerCase();

        double transportPrice = 0;

        switch (transportType){
            case "train":
                transportPrice = adultsCount * 24.99 + pupilsCount * 14.99;
                if (adultsCount + pupilsCount >= 50) {
                    transportPrice = transportPrice / 2.0;
                }
                break;
            case "bus" :
                transportPrice = adultsCount * 32.50 + pupilsCount * 28.50;
                break;
            case "boat" :
                transportPrice = adultsCount * 42.99 + pupilsCount * 39.99;
                break;
            case "airplane" :
                transportPrice = adultsCount * 70.00 + pupilsCount * 50.00;
                break;
        }
        double sleepPrice = nightsCount * 82.99;
        double totalPrice = (2 * transportPrice + sleepPrice) + (2 * transportPrice + sleepPrice) * 0.1;

        System.out.printf("%.2f", totalPrice);
    }
}
