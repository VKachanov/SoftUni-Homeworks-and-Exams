import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int entryNumber = Integer.parseInt(console.nextLine());

        int firstDigit = entryNumber/1000;
        int secondDigit = (entryNumber/100)%10;
        int thirdDigit = (entryNumber/10)%10;
        int fourthDigit = entryNumber%10;

        int sum = firstDigit+secondDigit+thirdDigit+fourthDigit;

        System.out.printf("%d\n", sum);
        System.out.printf("%d%d%d%d\n", fourthDigit, thirdDigit, secondDigit, firstDigit);
        System.out.printf("%d%d%d%d\n", fourthDigit, firstDigit, secondDigit, thirdDigit);
        System.out.printf("%d%d%d%d", firstDigit, thirdDigit, secondDigit, fourthDigit);

    }
}
