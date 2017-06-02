import java.util.Scanner;

public class p01Fishland {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double scombrusPrice = Double.parseDouble(console.nextLine());
        double cacaPrice = Double.parseDouble(console.nextLine());
        double palamudKg = Double.parseDouble(console.nextLine());
        double safridKg = Double.parseDouble(console.nextLine());
        int midiKg = Integer.parseInt(console.nextLine());

        double palamudPrice = (scombrusPrice + scombrusPrice * 60 / 100) * palamudKg;
        double safridPrice = (cacaPrice + cacaPrice * 80 / 100) * safridKg;
        double midiPrice = midiKg * 7.50;

        double bill = palamudPrice + safridPrice + midiPrice;

        System.out.printf("%.2f", bill);
    }
}
