import java.util.Scanner;

public class P05DrawFort {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int chavkiCount = n/2;
        int tireCount = n - chavkiCount - 2;

        String chavki = buildString("^", chavkiCount);
        String tire = buildString("_", tireCount);
        String topRow = "/" + chavki + "\\" + tire + tire + "/" + chavki + "\\";
        System.out.println(topRow);

        for (int i = 1; i <=  n- 2; i++) {
            String midBody = "|" + buildString(" ", 2*n - 2) + "|";
            if (i < n-2) {
                System.out.println(midBody);
            } else {
                String lastMidBodyLine = "|" + buildString(" ", chavkiCount + 1) + tire + tire
                        + buildString(" ", chavkiCount + 1) + "|";
                System.out.println(lastMidBodyLine);
            }
        }
        String bottomTire = buildString("_", chavkiCount);
        String bottomRow = "\\" + bottomTire + "/" + buildString(" ", 2*tireCount) + "\\" + bottomTire + "/";
        System.out.println(bottomRow);



    }
        public  static  String buildString(String text, int repeatCount) {

                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < repeatCount; i++) {

                    sb.append(text);
                }
                return sb.toString();
            }
}
