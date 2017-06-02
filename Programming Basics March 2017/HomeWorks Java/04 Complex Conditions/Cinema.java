import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String type = console.nextLine().toLowerCase();
        int raws = Integer.parseInt(console.nextLine());
        int columns = Integer.parseInt(console.nextLine());

        int full = raws * columns;
        double income = -1;

        switch (type) {
            case "premiere":
                income = full * 12.00;
                break;
            case "normal":
                income = full * 7.50;
                break;
            case "discount" :
                income = full*5.00;
                break;
        }
        System.out.printf("%.2f leva", income);
    }
}
