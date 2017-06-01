import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double entryValue = console.nextDouble();
        String firstCurrency = console.next();
        String secondCurrency = console.next();

        HashMap<String, Double> table = new HashMap<>();
        table.put("BGN", 1.0);
        table.put("USD", 1.79549);
        table.put("GBP", 2.53405);
        table.put("EUR", 1.95583);

        double result = table.get(firstCurrency) / table.get(secondCurrency) * entryValue;

        System.out.printf("The ammount in %s is: %.2f", secondCurrency, result);
    }
}
