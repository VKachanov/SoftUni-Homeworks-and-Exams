import java.util.Scanner;

public class p04Bills {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int monthsCount = Integer.parseInt(console.nextLine());

        double electricity = 0.0;
        double water = 0.0;
        double internet = 0.0;
        double other = 0.0;
        double total = 0.0;

        for (int i = 0; i < monthsCount; i++) {
            double elBill = Double.parseDouble(console.nextLine());

            electricity += elBill;
            water +=20;
            internet +=15;

        }
        other +=(electricity + water + internet) + (electricity + water + internet) * 20 /100;
        total += electricity + water + internet + other;
        System.out.printf("Electricity: %.2f lv%n", electricity);
        System.out.printf("Water: %.2f lv%n", water);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", other);
        System.out.printf("Average: %.2f lv", total / monthsCount);
    }
}
