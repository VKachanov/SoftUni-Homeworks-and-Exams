import java.util.Scanner;

public class p06ControlNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstNumber = Integer.parseInt(console.nextLine());
        int secondNumber = Integer.parseInt(console.nextLine());
        int controlNumber = Integer.parseInt(console.nextLine());

        int movesCount = 0;
        int sum = 0;

        for (int i = 1; i <= firstNumber; i++) {
            for (int j = secondNumber; j >= 1 ; j--) {
                sum += (i * 2 + j * 3);
                movesCount++;
                if (sum >= controlNumber) {
                    System.out.printf("%d moves%nScore: %d >= %d", movesCount, sum, controlNumber);
                    return;
                }
            }
        }
        System.out.printf("%d moves", movesCount);
    }
}
