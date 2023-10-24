import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class In_Lecture_Exercise {

    public static String calculateFines(LocalDate dueDate, LocalDate returnDate)
    {
        long days = ChronoUnit.DAYS.between(dueDate, returnDate);
        // If book is retunrned on or before the due date; no fine or fine = 0
        if (days <= 0)
        {
            return "No Fines";
        }
        // If book is returned after due date ; the fine is $2 for each day
        return String.valueOf(2 * days) + " dollars fine";
    }
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      // User input = date, month, year
      System.out.println("Please enter the date in the DD MM YYYY format : ");
      System.out.println("Please enter the date in the DD format : ");
      int date = scanner.nextInt();
      System.out.println("Please enter the month in the MM format : ");
      int month = scanner.nextInt();
      System.out.println("Please enter the year in the YYYY format : ");
      int year = scanner.nextInt();
      scanner.close();

      LocalDate returnDate = LocalDate.of(year, month, date);
      LocalDate dueDate =LocalDate.now();

      System.out.println("Due Date : " + dueDate.toString());

      System.out.println(calculateFines(dueDate, returnDate));





    }
}