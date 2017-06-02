import java.util.Scanner;

public class p02Pets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int daysGone = Integer.parseInt(console.nextLine());
        int foodLeftKg = Integer.parseInt(console.nextLine());
        double dogFood = Double.parseDouble(console.nextLine());
        double catFood = Double.parseDouble(console.nextLine());
        double turtleFood = Double.parseDouble(console.nextLine());

        double consumedFood = dogFood * daysGone + catFood * daysGone + turtleFood * daysGone /1000;
        double diff = foodLeftKg - consumedFood;
        if (diff >= 0) {
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(Math.abs(diff)));
        }
    }
}
