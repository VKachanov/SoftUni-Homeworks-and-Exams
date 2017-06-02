import java.util.Scanner;

public class Sequence2kplus1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int num = 1;
        System.out.println(num);
        for (int i = 0; i < n; i++) {
            num = num * 2 + 1;

            if (num <= n) {
                System.out.println(num);
            }
            if (num > n){
                break;
            }
        }
    }
}
