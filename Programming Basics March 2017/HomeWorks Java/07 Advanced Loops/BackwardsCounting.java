import java.util.Scanner;

public class BackwardsCounting {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.next());

        for (int i = n; i >=1 ; i--) {
            System.out.println(i);
        }
    }
}
