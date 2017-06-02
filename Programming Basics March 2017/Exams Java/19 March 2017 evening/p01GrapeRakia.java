import java.util.Scanner;

public class p01GrapeRakia {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double yardArea = Double.parseDouble(console.nextLine());
        double grapeKgPerSqM = Double.parseDouble(console.nextLine());
        double wastedGrapeKg = Double.parseDouble(console.nextLine());

        double totalKgGrape = yardArea * grapeKgPerSqM;
        double usableGrape = totalKgGrape - wastedGrapeKg;

        double grapeForRakiaKg = usableGrape * 0.45;
        double litersRakia = grapeForRakiaKg / 7.5;

        double rakiaMoney = litersRakia * 9.80;
        double remainingGrape = usableGrape * 0.55;
        double grapeMoney = remainingGrape * 1.50;

        System.out.printf("%.2f%n%.2f", rakiaMoney, grapeMoney);
    }
}
