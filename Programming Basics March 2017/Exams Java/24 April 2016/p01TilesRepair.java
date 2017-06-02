import java.text.DecimalFormat;
import java.util.Scanner;

public class p01TilesRepair {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double squareSide = Double.parseDouble(console.nextLine());
        double widthTile = Double.parseDouble(console.nextLine());
        double lengthTile = Double.parseDouble(console.nextLine());
        double benchWidth = Double.parseDouble(console.nextLine());
        double benchLength = Double.parseDouble(console.nextLine());

        double squareArea= squareSide*squareSide;
        double benchArea = benchLength*benchWidth;
        double tileArea = widthTile * lengthTile;

        double tileQuantity = (squareArea - benchArea)/tileArea;
        double timeNeeded = tileQuantity*0.2;

        System.out.printf("%s%n%s", doubleToStringCSharpLike(tileQuantity), doubleToStringCSharpLike(timeNeeded));
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
