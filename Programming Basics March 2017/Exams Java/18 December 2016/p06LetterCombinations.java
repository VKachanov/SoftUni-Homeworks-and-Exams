import java.util.Scanner;

public class p06LetterCombinations {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char beginLetter = console.nextLine().charAt(0);
        char endLetter = console.nextLine().charAt(0);
        char skipLetter = console.nextLine().charAt(0);

        int counter = 0;

        for (char i = beginLetter; i <= endLetter; i++) {
            for (char j = beginLetter; j <= endLetter; j++) {
                for (char k = beginLetter; k <= endLetter; k++) {
                    if (i == skipLetter || j == skipLetter || k == skipLetter) {

                    } else {
                        System.out.printf("%c%c%c ", i, j, k);
                        counter++;
                    }
                }
            }
        }
        System.out.printf("%d", counter);
    }
}
