import java.util.Scanner;

public class Numbers100Text {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int input = Integer.parseInt(console.nextLine());

        int a = (input / 10) - 2;
        int b = (input % 10);
        String[] zeroToNineteen = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        String[] tens = new String[]{"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};


        if (input >= 0 && input <= 100) {

            if (input >= 0 && input <= 19) {
                System.out.println(zeroToNineteen[input]);
            } else if (input == 100) {
                System.out.println("one hundred");
            } else if (input % 10 == 0 && input >= 20 && input < 100) {
                System.out.println(tens[a]);
            } else {
                System.out.println(tens[a] + " " + zeroToNineteen[b]);
            }

        } else {
            System.out.println("invalid number");
        }
    }
}


