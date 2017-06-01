import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double number = Double.parseDouble(console.nextLine());
        String input = console.nextLine();
        String output = console.nextLine();
        
        double mm = 1000.0;
        double cm = 100.0;
        double mi = 0.000621371192;
        double in = 39.3700787;
        double km = 0.001;
        double ft = 3.2808399;
        double yd = 1.0936133;
        double m = 1.0;

        if (input.equals ("mm")) {
            number = number / mm;
        } else if (input .equals ("m")) {
            number = number / m;
        } else if (input .equals ("cm")) {
            number = number / cm;
        } else if (input .equals ("mi")) {
            number = number / mi;
        } else if (input .equals ("in")) {
            number = number / in;
        } else if (input .equals ("km")) {
            number = number / km;
        } else if (input .equals ("ft")) {
            number = number / ft;
        } else if (input .equals ("yd")) {
            number = number / yd;
        }

        if (output .equals ("mm")) {
            number = number * mm;
        } else if (output .equals ("m")) {
            number = number * m;
        } else if (output .equals ("cm")) {
            number = number * cm;
        } else if (output .equals ("mi")) {
            number = number * mi;
        } else if (output .equals ("in")) {
            number = number * in;
        } else if (output .equals ("km")) {
            number = number * km;
        } else if (output .equals ("ft")) {
            number = number * ft;
        } else if (output .equals ("yd")) {
            number = number * yd;

        }
        System.out.printf("%f %s", number, output);
    }
}
