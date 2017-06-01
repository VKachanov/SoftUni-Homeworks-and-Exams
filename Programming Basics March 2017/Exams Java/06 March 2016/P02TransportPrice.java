import java.util.Scanner;

public class P02TransportPrice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int km = Integer.parseInt(console.nextLine());
        String time = console.nextLine().toLowerCase();

        double travelPrice;

        if (km<20) {
            if (time.equals("day")) {
                travelPrice = 0.70 + km*0.79;
            } else {
                travelPrice = 0.70 + km*0.90;
            }
        } else if (km >= 100) {
            travelPrice = km*0.06;
        } else {
            travelPrice = km*0.09;
        }
        System.out.println(travelPrice);
    }
}
