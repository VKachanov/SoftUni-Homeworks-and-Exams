import java.util.Scanner;

public class p02ChangeTiles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        double widthFloor = Double.parseDouble(console.nextLine());
        double lengthFloor = Double.parseDouble(console.nextLine());
        double triangleSide = Double.parseDouble(console.nextLine());
        double triangleHeight = Double.parseDouble(console.nextLine());
        double tilePrice = Double.parseDouble(console.nextLine());
        double workerPrice = Double.parseDouble(console.nextLine());

        double floorArea = widthFloor * lengthFloor;
        double tileArea = triangleSide * triangleHeight / 2;
        double tilesNeeded = Math.ceil(floorArea / tileArea) + 5;
        double moneyNeeded = tilesNeeded * tilePrice + workerPrice;

        double diff = budget - moneyNeeded;

        if (diff >= 0 ) {
            System.out.printf("%.2f lv left.", diff);
        }else {
            System.out.printf("You'll need %.2f lv more.", Math.abs(diff));
        }
    }
}
