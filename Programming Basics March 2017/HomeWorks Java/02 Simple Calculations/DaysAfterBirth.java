import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DaysAfterBirth {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String inputDate = console.next();

        LocalDate parseDate = LocalDate.parse(inputDate, formatter);

        LocalDate newDate = parseDate.plusDays(999);

        String outDate = newDate.format(formatter);

        System.out.println(outDate);
    }
}
