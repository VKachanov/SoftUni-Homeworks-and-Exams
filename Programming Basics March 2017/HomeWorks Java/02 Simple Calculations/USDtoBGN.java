import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Please enter ammount in USD: " );
        double usd = Double.parseDouble(console.nextLine());

        double bgn = usd*1.79549;

        System.out.printf("The ammount in BGN is: %.2f", bgn);
    }
}
