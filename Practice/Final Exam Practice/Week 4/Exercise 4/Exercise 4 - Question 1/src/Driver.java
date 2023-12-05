import java.util.Arrays;
import java.util.Collections;

public class Driver {

    public static void sortDescending(int arr[])
    {
        Integer[] numbers = new Integer[arr.length];
        Arrays.setAll(numbers, i->arr[i]);

        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorting in Descending Order : " + Arrays.toString(numbers));

    }


    public static void main(String[] args) {
        int[] arr = new int[] {2,4,1,9,8,6};

        System.out.println("Before Sorting : " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorting in Ascending Order : " + Arrays.toString(arr));

        sortDescending(arr);
    }
}