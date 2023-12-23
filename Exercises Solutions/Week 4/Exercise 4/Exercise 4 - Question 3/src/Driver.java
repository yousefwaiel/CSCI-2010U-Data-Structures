import java.util.ArrayList;

public class Driver {

    public static ArrayList<Integer> runningSum(ArrayList<Integer> numbers)
    {
        ArrayList<Integer> result = new ArrayList<>();

        result.add(0, numbers.get(0));

        for (int i = 1; i < numbers.size(); i++)
        {
            result.add(i,result.get(i-1) + numbers.get(i));
        }
        return result;
    }

    public static ArrayList<Integer> runningSum_better(ArrayList<Integer> numbers)
    {
        for (int i = 1; i < numbers.size(); i++)
        {
            numbers.set(i, numbers.get(i) + numbers.get(i-1));
        }
        return numbers;
    }

    public static void main(String[] args) {
      ArrayList<Integer> numbers = new ArrayList<>();
      numbers.add(1);
      numbers.add(2);
      numbers.add(3);
      numbers.add(4);

      System.out.println("Original Array List : " + numbers);

      System.out.println("Resultant Array : " + runningSum_better(numbers));

    }
}