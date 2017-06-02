import java.util.Scanner;

public class p05StopSign {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int totalWidth = 4*n + 3;

        int sideDotsCount = n+1;
        int upDashesCount = totalWidth - 2*sideDotsCount;
        String upLine = buildString(".", sideDotsCount) + buildString("_", upDashesCount)
                + buildString(".", sideDotsCount);
        System.out.println(upLine);

        sideDotsCount--;
        for (int i = 0; i < n; i++) {
            int upCycleDashesCount = totalWidth - 2*sideDotsCount - 4;
            String upCycleSideDots = buildString(".", sideDotsCount);
            String upCycleDashes = buildString("_", upCycleDashesCount);
            String upCycle = upCycleSideDots + "//" + upCycleDashes + "\\\\" + upCycleSideDots;
            System.out.println(upCycle);

            sideDotsCount--;
        }

        int stopLineDashes = (totalWidth - 9)/2;
        String stopLine = "//" + buildString("_", stopLineDashes)+ "STOP!" + buildString("_", stopLineDashes)
                + "\\\\";
        System.out.println(stopLine);

        for (int i = 0; i < n; i++) {
            int downCycleDashesCount = totalWidth - 2*sideDotsCount - 4;
            String downCycleSideDots = buildString(".", sideDotsCount);
            String downCycleDashes = buildString("_", downCycleDashesCount);
            String downCycle = downCycleSideDots + "\\\\" + downCycleDashes + "//" + downCycleSideDots;
            System.out.println(downCycle);

            sideDotsCount++;
        }
    }
        private  static  String buildString(String text, int repeatCount) {

                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < repeatCount; i++) {

                    sb.append(text);
                }
                return sb.toString();
            }
}
