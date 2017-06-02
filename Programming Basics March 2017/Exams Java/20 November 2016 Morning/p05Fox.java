import java.util.Scanner;

public class p05Fox {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int totalWidth = 2 * n + 3;
        int sideStarsCount = 1;


        for (int i = 0; i < n; i++) {
            int midDashesCount = totalWidth - 2 * sideStarsCount - 2;
            String sideStars = buildString("*", sideStarsCount);
            String midDashes = buildString("-", midDashesCount);
            String upperBody = sideStars + "\\" + midDashes + "/" + sideStars;
            System.out.println(upperBody);

            sideStarsCount++;
        }
        int sideMidInternalStars = n / 2;
        for (int i = 0; i < n / 3; i++) {
            int midMidInternalSTars = totalWidth - 2 * sideMidInternalStars - 4;
            String sideMidStars = buildString("*", sideMidInternalStars);
            String midMidStars = buildString("*", midMidInternalSTars);
            String midBody = "|" + sideMidStars + "\\" + midMidStars + "/" + sideMidStars + "|";
            System.out.println(midBody);

            sideMidInternalStars++;
        }
        sideStarsCount = 1;
        for (int i = 0; i < n; i++) {
            int midDashesCount = totalWidth - 2 * sideStarsCount - 2;
            String sideStars = buildString("-", sideStarsCount);
            String midDashes = buildString("*", midDashesCount);
            String lowerBody = sideStars + "\\" + midDashes + "/" + sideStars;
            System.out.println(lowerBody);

            sideStarsCount++;
        }



    }
        public  static  String buildString(String text, int repeatCount) {

                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < repeatCount; i++) {

                    sb.append(text);
                }
                return sb.toString();
            }
}
