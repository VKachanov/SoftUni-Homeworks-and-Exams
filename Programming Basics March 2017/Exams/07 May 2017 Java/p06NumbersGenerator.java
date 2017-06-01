import java.util.Scanner;

public class p06NumbersGenerator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = Integer.parseInt(console.nextLine());
        int n = Integer.parseInt(console.nextLine());
        int l = Integer.parseInt(console.nextLine());
        int specialNumber = Integer.parseInt(console.nextLine());
        int controlNumber = Integer.parseInt(console.nextLine());

        for (int i = m; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                for (int k = l; k >= 1; k--) {
                    if (specialNumber >= controlNumber) {
                        System.out.printf("Yes! Control number was reached! Current special number is %d.", specialNumber);
                        return;
                    }
                    if ((i + j + k) % 3 == 0) {
                        specialNumber += 5;
                    } else if (k == 5) {
                        specialNumber -= 2;

                    } else if (k % 2 == 0) {
                        specialNumber *= 2;

                    }
                }
            }
        }
        System.out.printf("No! %d is the last reached special number.", specialNumber);
    }
}
