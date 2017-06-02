import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int num = 1;

        for (int raw = 1; raw <= n; raw++) {
            for (int col = 1; col <= raw; col++) {
                System.out.print(num + " ");
                num++;
                if (num > n) {
                    break;
                }
            }
            System.out.println();
            if (num > n) {
                break;
            }
        }
    }
}
