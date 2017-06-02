import java.util.Scanner;

public class p04BackToThePast {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        int yearToLast = Integer.parseInt(console.nextLine());

        int age = 18;
        double spentMoney = 0;

        for (int i = 1800; i <= yearToLast; i++) {
            if (i%2 == 0) {
                spentMoney +=12000;
            } else {
                spentMoney += 12000 + 50*age;
            }
            age++;
        }
        double diference = budget - spentMoney;
        if (diference>=0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", diference);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(diference));
        }
    }
}
