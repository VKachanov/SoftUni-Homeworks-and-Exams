import java.util.Scanner;

public class TriangleDollars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n  = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }

    }
}
