import java.util.Scanner;

public class p01HousePrice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double smallestRoomArea = Double.parseDouble(console.nextLine());
        double kitchenArea = Double.parseDouble(console.nextLine());
        double pricePerSqM = Double.parseDouble(console.nextLine());

        double bathroomArea = smallestRoomArea / 2;
        double secondRoomArea = smallestRoomArea + smallestRoomArea * 10 / 100;
        double thirdRoomArea = secondRoomArea + secondRoomArea * 10 / 100;

        double appAreaNoCorridor = smallestRoomArea + kitchenArea + bathroomArea + secondRoomArea + thirdRoomArea;
        double totalAppArea = appAreaNoCorridor + appAreaNoCorridor * 5 / 100;
        double appPrice = totalAppArea * pricePerSqM;

        System.out.printf("%.2f", appPrice);
    }
}
