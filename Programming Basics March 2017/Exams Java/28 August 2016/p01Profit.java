import java.util.Scanner;

public class p01Profit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int monthWorkDays = Integer.parseInt(console.nextLine());
        double dollarsPerDay = Double.parseDouble(console.nextLine());
        double exchangeRate = Double.parseDouble(console.nextLine());

        double monthlyIncome = monthWorkDays * dollarsPerDay;
        double yearlyIncomeBeforeTax = monthlyIncome * 12 + monthlyIncome * 2.5;
        double incomeAfterTaxDollars = yearlyIncomeBeforeTax - yearlyIncomeBeforeTax * 25.0/100;
        double incomeLeva = incomeAfterTaxDollars * exchangeRate;
        double dailyIncome = incomeLeva / 365;
        System.out.printf("%.2f", dailyIncome);
    }
}
