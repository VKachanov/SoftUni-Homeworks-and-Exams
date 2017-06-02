import java.util.Scanner;

public class p03Flowers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int hrizantemiCount = Integer.parseInt(console.nextLine());
        int rosesCount = Integer.parseInt(console.nextLine());
        int tulipsCount = Integer.parseInt(console.nextLine());
        String season = console.nextLine().toLowerCase();
        char holiday = console.nextLine().toLowerCase().charAt(0);

        double bucketPrice = 0;
        int totalFlowers = hrizantemiCount + rosesCount + tulipsCount;

        switch (season) {
            case "spring":
            case "summer":
                switch (holiday) {
                    case 'n':
                        bucketPrice = hrizantemiCount * 2.0 + rosesCount * 4.10 + tulipsCount * 2.50;
                        if (tulipsCount > 7) {
                            bucketPrice = bucketPrice - bucketPrice * 5.0 / 100;
                        }
                        if (totalFlowers > 20) {
                            bucketPrice = bucketPrice - bucketPrice * 20.0 / 100;
                        }
                        break;
                    case 'y':
                        bucketPrice = (hrizantemiCount * 2.0 + rosesCount * 4.10 + tulipsCount * 2.50)
                                + (hrizantemiCount * 2.0 + rosesCount * 4.10 + tulipsCount * 2.50) * 15.0 / 100;
                        if (tulipsCount > 7) {
                            bucketPrice = bucketPrice - bucketPrice * 5.0 / 100;
                        }
                        if (totalFlowers > 20) {
                            bucketPrice = bucketPrice - bucketPrice * 20.0 / 100;
                        }
                        break;
                }
                break;
            case "winter":
            case "autumn":
                switch (holiday) {
                    case 'n':
                        bucketPrice = hrizantemiCount * 3.75 + rosesCount * 4.50 + tulipsCount * 4.15;
                        if (rosesCount >= 10) {
                            bucketPrice = bucketPrice - bucketPrice * 10.0 / 100;
                        }
                        if (totalFlowers > 20) {
                            bucketPrice = bucketPrice - bucketPrice * 20.0 / 100;
                        }
                        break;
                    case 'y':
                        bucketPrice = (hrizantemiCount * 3.75 + rosesCount * 4.50 + tulipsCount * 4.15)
                                + (hrizantemiCount * 3.75 + rosesCount * 4.50 + tulipsCount * 4.15) * 15.0 / 100;
                        if (tulipsCount > 7) {
                            bucketPrice = bucketPrice - bucketPrice * 5.0 / 100;
                        }
                        if (rosesCount >= 10) {
                            bucketPrice = bucketPrice - bucketPrice * 10.0 / 100;
                        }
                        if (totalFlowers > 20) {
                            bucketPrice = bucketPrice - bucketPrice * 20.0 / 100;
                        }
                        break;
                }
                break;
        }
        System.out.printf("%.2f", bucketPrice + 2);
    }
}
