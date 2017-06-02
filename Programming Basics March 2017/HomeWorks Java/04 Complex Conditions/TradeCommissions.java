import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String town = console.nextLine().toLowerCase();
        double volume = Double.parseDouble(console.nextLine());

        double commission = -1;

        switch (town) {
            case "sofia":
                if (volume >= 0 && volume <= 500) {
                    commission = volume * 5 / 100;
                } else if (volume > 500 && volume <= 1000) {
                    commission = volume * 7 / 100;
                } else if (volume > 1000 && volume <= 10000) {
                    commission = volume * 8 / 100;
                } else if (volume > 10000) {
                    commission = volume * 12 / 100;
                }


                break;
            case "varna":
                if (volume >= 0 && volume <= 500) {
                    commission = volume * 4.5 / 100;
                } else if (volume > 500 && volume <= 1000) {
                    commission = volume * 7.5 / 100;
                } else if (volume > 1000 && volume <= 10000) {
                    commission = volume * 10 / 100;
                } else if (volume > 10000) {
                    commission = volume * 13 / 100;
                }


                break;
            case "plovdiv":
                if (volume >= 0 && volume <= 500) {
                    commission = volume * 5.5 / 100;
                } else if (volume > 500 && volume <= 1000) {
                    commission = volume * 8 / 100;
                } else if (volume > 1000 && volume <= 10000) {
                    commission = volume * 12 / 100;
                } else if (volume > 10000) {
                    commission = volume * 14.5 / 100;
                }


                break;
        }
        if (commission>=0) {
            System.out.printf("%.2f", commission);
        } else {
            System.out.println("error");
        }
    }
}
