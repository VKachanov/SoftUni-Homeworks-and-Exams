import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());


//        for (int i = 1; i <= (n + 1) / 2; i++) {
//            int dashes = ((n + 1) / 2) - i;
//            String roof = buildString("-", dashes) + buildString("*", n - 2*dashes)
//                    + buildString("-", dashes);
//
//            System.out.println(roof);
//        }
//
//        for (int i = 0; i <= n/2 - 1; i++) {
//            String bottom = buildString("|", 1) + buildString("*",n-2)
//                    + buildString("|", 1);
//            System.out.println(bottom);
//        }

        int starsCount = 1;
        int baseHeight = n/2;
        int roofHeight = n - baseHeight;

        if (n%2==0) {
            starsCount++;
        }
        
        int dashesCount = n - starsCount;
        String dashes = "-";
        String stars = "*";

        for (int i = 0; i < roofHeight; i++) {
            System.out.print(buildString(dashes, dashesCount/2));
            System.out.print(buildString(stars, starsCount));
            System.out.println(buildString(dashes, dashesCount/2));

            starsCount +=2;
            dashesCount -=2;
        }
        for (int i = 0; i < baseHeight; i++) {
            System.out.println("|" + buildString("*", n-2) + "|");

        }
    }

    public static String buildString(String text, int repeatCount) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeatCount; i++) {

            sb.append(text);
        }
        return sb.toString();
    }
}
