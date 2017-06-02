import java.util.Scanner;

public class p03HotelRoom {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String month = console.nextLine().toLowerCase();
        int nightsCount = Integer.parseInt(console.nextLine());

        double studioPrice = 0;
        double appPrice = 0;

        switch (month) {
            case "may":
            case "october":
                studioPrice = nightsCount * 50.0;
                appPrice = nightsCount * 65.0;
                if (nightsCount > 7 && nightsCount <= 14) {
                    studioPrice = studioPrice - studioPrice * 5 / 100;
                } else if (nightsCount > 14) {
                    studioPrice = studioPrice - studioPrice * 30 / 100;
                    appPrice = appPrice - appPrice * 10 / 100;
                }
                break;
            case "june":
            case "september":
                studioPrice = nightsCount * 75.20;
                appPrice = nightsCount * 68.70;
                if (nightsCount > 14) {
                    studioPrice = studioPrice - studioPrice * 20 / 100;
                    appPrice = appPrice - appPrice * 10 / 100;
                }
                break;
            case "july":
            case "august":
                studioPrice = nightsCount * 76.00;
                appPrice = nightsCount * 77.00;
                if (nightsCount > 14) {
                    appPrice = appPrice - appPrice * 10 / 100;
                }
                break;

        }
        System.out.printf("Apartment: %.2f lv.%n", appPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
