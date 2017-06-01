import java.text.DecimalFormat;
import java.util.Scanner;

public class p01GroceryMarket {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double vegPrice = Double.parseDouble(console.nextLine());
        double fruitPrice = Double.parseDouble(console.nextLine());
        int vegKg = Integer.parseInt(console.nextLine());
        int fruitKg = Integer.parseInt(console.nextLine());

        double income = (vegKg*vegPrice + fruitKg*fruitPrice)/1.94;
        System.out.println(doubleToStringCSharpLike(income));
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
