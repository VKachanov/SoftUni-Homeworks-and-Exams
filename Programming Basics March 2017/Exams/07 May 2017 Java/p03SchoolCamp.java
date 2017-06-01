import java.util.Scanner;

public class p03SchoolCamp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String season = console.nextLine().toLowerCase();
        String groupType = console.nextLine().toLowerCase();
        int pupilsCount = Integer.parseInt(console.nextLine());
        int nightsCount = Integer.parseInt(console.nextLine());

        String sports = "";
        double acomodationPrice = 0;

        switch (season) {
            case "winter":
                switch (groupType) {
                    case "boys":
                        sports = "Judo";
                        acomodationPrice = pupilsCount * nightsCount * 9.60;
                        break;
                    case "girls":
                        sports = "Gymnastics";
                        acomodationPrice = pupilsCount * nightsCount * 9.60;
                        break;
                    case "mixed":
                        sports = "Ski";
                        acomodationPrice = pupilsCount * nightsCount * 10.0;
                        break;
                }
                break;
            case "spring":
                switch (groupType) {
                    case "boys":
                        sports = "Tennis";
                        acomodationPrice = pupilsCount * nightsCount * 7.20;
                        break;
                    case "girls":
                        sports = "Athletics";
                        acomodationPrice = pupilsCount * nightsCount * 7.20;
                        break;
                    case "mixed":
                        sports = "Cycling";
                        acomodationPrice = pupilsCount * nightsCount * 9.50;
                        break;
                }
                break;
            case "summer" :
                switch (groupType) {
                    case "boys":
                        sports = "Football";
                        acomodationPrice = pupilsCount * nightsCount * 15.0;
                        break;
                    case "girls":
                        sports = "Volleyball";
                        acomodationPrice = pupilsCount * nightsCount * 15.0;
                        break;
                    case "mixed":
                        sports = "Swimming";
                        acomodationPrice = pupilsCount * nightsCount * 20.0;
                        break;
                }
                break;
        }
        if (pupilsCount >= 50) {
            acomodationPrice = acomodationPrice - acomodationPrice * 50.0 / 100;
        } else if (pupilsCount >= 20 && pupilsCount < 50) {
            acomodationPrice = acomodationPrice - acomodationPrice * 15.0 / 100;
        } else if (pupilsCount >= 10 && pupilsCount < 20) {
            acomodationPrice = acomodationPrice - acomodationPrice * 5.0 / 100;
        }

        System.out.printf("%s %.2f lv.", sports, acomodationPrice);
    }
}
