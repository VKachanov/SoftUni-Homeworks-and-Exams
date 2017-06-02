import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int num = Integer.parseInt(console.nextLine());
        int max = num;

        for (int i = 0; i < n-1; i++) {
            num = Integer.parseInt(console.nextLine());
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
