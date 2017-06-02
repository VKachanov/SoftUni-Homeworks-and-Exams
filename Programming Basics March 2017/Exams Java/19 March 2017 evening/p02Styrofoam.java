import java.util.Scanner;

public class p02Styrofoam {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        double houseArea = Double.parseDouble(console.nextLine());
        int windowsCount = Integer.parseInt(console.nextLine());
        double styrofoamSqMInPackage = Double.parseDouble(console.nextLine());
        double styrofoamPricePerPackage = Double.parseDouble(console.nextLine());

        double workingArea = (houseArea - windowsCount * 2.4) + (houseArea - windowsCount * 2.4) * 10 / 100;
        double neededPackages = Math.ceil(workingArea / styrofoamSqMInPackage);

        double styrofoamTotalPrice = neededPackages * styrofoamPricePerPackage;

        double diff = budget - styrofoamTotalPrice;

        if (diff >= 0) {
            System.out.printf("Spent: %.2f%nLeft: %.2f", styrofoamTotalPrice, diff);
        } else {
            System.out.printf("Need more: %.2f", Math.abs(diff));
        }
    }
}
