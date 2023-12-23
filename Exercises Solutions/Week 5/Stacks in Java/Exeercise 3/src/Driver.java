import java.util.Collections;
import java.util.PriorityQueue;

public class Driver {

    public static int maxProduct(int[] numbers)
    {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int number : numbers)
        {
            queue.add(number);
        }

        int result = queue.poll() * queue.poll();
        return result;


    }

    public static void main(String[] args) {

        int[] numbers = new int[] {15,2,1,8,10};

        System.out.println("Max product : " + maxProduct(numbers));
    }
}