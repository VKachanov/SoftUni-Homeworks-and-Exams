import java.text.DecimalFormat;
import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int n = Integer.parseInt(console.nextLine());

        double oddSum = 0;
        double evenSum = 0;

        double oddMax = -Double.MAX_VALUE;
        double oddMin = Double.MAX_VALUE;

        double evenMax = -Double.MAX_VALUE;
        double evenMin = Double.MAX_VALUE;

        DecimalFormat df = new DecimalFormat("#.#####");

        for (int i = 0; i < n; i++) {
            double entryNum = Double.parseDouble(console.nextLine());

            if (i % 2 == 0) {
                oddSum += entryNum;

                if (entryNum > oddMax) {
                    oddMax = entryNum;
                }
                if (entryNum < oddMin) {
                    oddMin = entryNum;
                }
            } else {

                evenSum += entryNum;
                if (entryNum > evenMax) {
                    evenMax = entryNum;
                }
                if (entryNum < evenMin) {
                    evenMin = entryNum;
                }
            }
        }
        if (n == 0) {
            System.out.printf("OddSum = 0%nOddMin = No%nOddMax = No%nEvenSum = 0%nEvenMin = No%nEvenMax = No");
        } else if (n == 1) {
            System.out.printf("OddSum = %s%nOddMin = %s%nOddMax = %s%nEvenSum = %s%nEvenMin = %s%nEvenMax = %s",
                    df.format(oddSum), df.format(oddMin), df.format(oddMax), "0", "No", "No");
        } else {
            System.out.printf("OddSum = %s%nOddMin = %s%nOddMax = %s%nEvenSum = %s%nEvenMin = %s%nEvenMax = %s",
                    df.format(oddSum), df.format(oddMin), df.format(oddMax), df.format(evenSum), df.format(evenMin),
                    df.format(evenMax));
        }
    }
}
