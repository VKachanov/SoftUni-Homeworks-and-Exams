import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int player1 = Integer.parseInt(console.nextLine());
        int player2 = Integer.parseInt(console.nextLine());
        int player3 = Integer.parseInt(console.nextLine());

        int summedTime = player1 + player2 + player3;

        if (summedTime < 59) {
            if (summedTime < 9) {
                System.out.printf("0:0%d", summedTime);
            } else{
                System.out.printf("0:%d", summedTime);
            }
        } else if (summedTime < 120) {
            if (summedTime < 69) {
                System.out.printf("1:0%d", summedTime -60);
            } else {
                System.out.printf("1:%d", summedTime - 60);
            }
        } else if (summedTime < 180) {
            if (summedTime < 129) {
                System.out.printf("2:0%d", summedTime - 120);
            } else {
                System.out.printf("2:%d", summedTime - 120);
            }
        }
    }
}
