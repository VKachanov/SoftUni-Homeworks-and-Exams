import java.util.Scanner;

public class GroceryMarket {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double priceVegetable = Double.parseDouble(console.nextLine());
        double priceFruit = Double.parseDouble(console.nextLine());

        int kgVegetable = Integer.parseInt(console.nextLine());
        int kgFruit = Integer.parseInt(console.nextLine());

        double totalIncome = (priceVegetable*kgVegetable + priceFruit*kgFruit) / 1.94;

        System.out.println(totalIncome);
    }
}

