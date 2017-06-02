import java.util.Scanner;

public class p06StopNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int startNumber = Integer.parseInt(console.nextLine());
        int endNumber = Integer.parseInt(console.nextLine());
        int stopNumber = Integer.parseInt(console.nextLine());



        for (int i = endNumber; i >= startNumber; i--) {
            if (i % 2 == 0 && i % 3 == 0 && i == stopNumber) {
                break;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.printf("%d ", i);
            }

        }
    }
}
