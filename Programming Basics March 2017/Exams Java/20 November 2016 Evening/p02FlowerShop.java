import java.util.Scanner;

public class p02FlowerShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int magnoliiCount = Integer.parseInt(console.nextLine());
        int zumbuliCount = Integer.parseInt(console.nextLine());
        int rosesCount = Integer.parseInt(console.nextLine());
        int cactiCount = Integer.parseInt(console.nextLine());
        double giftPrice = Double.parseDouble(console.nextLine());

        double incomeBeforeTax = magnoliiCount * 3.25 + zumbuliCount * 4 + rosesCount * 3.50 + cactiCount * 8;
        double afterTaxIncome = incomeBeforeTax - incomeBeforeTax * 5 /100;

        double diff = giftPrice - afterTaxIncome;

        if (diff <=0) {
            System.out.printf("She is left with %.0f leva.", Math.floor(Math.abs(diff)));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(diff));
        }

    }
}
