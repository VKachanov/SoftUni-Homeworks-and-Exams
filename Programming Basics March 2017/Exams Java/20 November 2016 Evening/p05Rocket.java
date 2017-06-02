import java.util.Scanner;

public class p05Rocket {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int totalWIdth = 3 * n;
        int upperSideDotsCount = (totalWIdth - 2) / 2;


        for (int i = 0; i < n; i++) {
            int upperMidSPacesCount = totalWIdth - 2 * upperSideDotsCount - 2;
            String upperSideDots = buildString(".", upperSideDotsCount);
            String upperMidSpaces = buildString(" ", upperMidSPacesCount);
            String upperBody = upperSideDots + "/" + upperMidSpaces + "\\" + upperSideDots;
            System.out.println(upperBody);

            upperSideDotsCount--;
        }
        upperSideDotsCount++;
        int upperMidSPacesCount = totalWIdth - 2 * upperSideDotsCount - 2;
        String upperSideDots = buildString(".", upperSideDotsCount);
        String upperMidStsrs = buildString("*", upperMidSPacesCount);
        String midRow = upperSideDots + "*" + upperMidStsrs + "*" + upperSideDots;
        System.out.println(midRow);

        for (int i = 0; i < 2 * n; i++) {
            int midSlashesCount = totalWIdth - 2 * upperSideDotsCount - 2;
            String midSideDots = buildString(".", upperSideDotsCount);
            String midMidSlashes = buildString("\\", midSlashesCount);
            String midleBody = midSideDots + "|" + midMidSlashes + "|" + midSideDots;
            System.out.println(midleBody);
        }

        for (int i = 0; i < n / 2; i++) {
            int lowerMidStarsCount = totalWIdth - 2 * upperSideDotsCount - 2;
            String lowerSideDots = buildString(".", upperSideDotsCount);
            String lowerMidStars = buildString("*", lowerMidStarsCount);
            String lowerBody = lowerSideDots + "/" + lowerMidStars + "\\" + lowerSideDots;
            System.out.println(lowerBody);

            upperSideDotsCount--;
        }

    }

    private static String buildString(String text, int repeatCount) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeatCount; i++) {

            sb.append(text);
        }
        return sb.toString();

    }
}
