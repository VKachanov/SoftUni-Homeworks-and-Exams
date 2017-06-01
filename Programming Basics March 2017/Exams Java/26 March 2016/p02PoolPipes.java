import java.text.DecimalFormat;
import java.util.Scanner;

public class p02PoolPipes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int poolVolume = Integer.parseInt(console.nextLine());
        int debitFirstPipe = Integer.parseInt(console.nextLine());
        int debitSecondPipe = Integer.parseInt(console.nextLine());
        double hours = Double.parseDouble(console.nextLine());

        double firstPipeContribution = debitFirstPipe*hours;
        double secondPipeContribution = debitSecondPipe*hours;
        double totalContribution = firstPipeContribution + secondPipeContribution;
        double difference = poolVolume - totalContribution;
 //       DecimalFormat df = new DecimalFormat("0");
        if (difference >= 0) {
            System.out.printf("The pool is %s%% full. Pipe 1: %s%%. Pipe 2: %s%%.", (int)(totalContribution*100.0/poolVolume),
                    (int)(firstPipeContribution*100.0/totalContribution),
                    (int)(secondPipeContribution*100.0/totalContribution));
        } else {
            System.out.printf("For %s hours the pool overflows with %s liters.", doubleToStringCSharpLike(hours),
                    doubleToStringCSharpLike(Math.abs(difference)));
        }

    }
     private static String doubleToStringCSharpLike(double value) {
             int digits = 15;

             if (Math.abs(value) >= 1.0d) {
                 digits -= Double.toString(value).split("[.,]")[0].length();
             }

             String format = "0." + new String(new char[digits]).replace("\0", "#");
             DecimalFormat df = new DecimalFormat(format);

             return df.format(value);
         }
}
