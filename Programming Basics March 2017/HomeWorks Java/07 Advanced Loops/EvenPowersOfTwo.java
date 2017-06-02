import java.util.Scanner;

public class EvenPowersOfTwo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int num = 1;
        System.out.println(num);
        for (int i = 1; i <= n ; i++) {
            if (i%2==0) {
                num *=4;
                System.out.println(num);
            }
        }
    }
}
