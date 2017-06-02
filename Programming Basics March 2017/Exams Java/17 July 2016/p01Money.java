import java.text.DecimalFormat;
import java.util.Scanner;

public class p01Money {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int bitcoins = Integer.parseInt(console.nextLine());
        double yuans = Double.parseDouble(console.nextLine());
        double commission = Double.parseDouble(console.nextLine());

        int bitLeva = bitcoins * 1168;
        double yuanLeva = yuans*0.15*1.76;
        double totalLeva = bitLeva + yuanLeva;
        double totalEur = totalLeva/1.95;
        double finalSum = totalEur - (totalEur * commission/100.0);
        System.out.println(doubleToStringCSharpLike(finalSum));
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
