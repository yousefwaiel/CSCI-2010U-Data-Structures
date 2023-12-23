import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter due date in the format of YYYY-MM-DD : ");
        String dueDateString = scanner.next();

        LocalDate dueDate = LocalDate.parse(dueDateString);

        System.out.println("Enter your return date in the format of YYYY-MM-DD : ");
        String returnDateString = scanner.next();

        LocalDate returnDate = LocalDate.parse(returnDateString);

        long daysDifference = ChronoUnit.DAYS.between(dueDate,returnDate);

        int fine = 0;

        if (daysDifference > 0)
        {
            fine = 2 * (int) daysDifference;
        }


        System.out.println("Your fine amount is = $" + fine);



    }
}