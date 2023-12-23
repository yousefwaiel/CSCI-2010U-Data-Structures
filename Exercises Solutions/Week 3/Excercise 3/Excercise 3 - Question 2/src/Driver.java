import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Driver {
    public static int[] reverseArray(int[] arr)
    {
        for(int i = 0; i < arr.length / 2; i++) // O(n)
        {
            int temp = arr[i]; // O(1)
            arr[i] = arr[arr.length - i - 1]; // O(1)
            arr[arr.length - i - 1] = temp; // O(1)
        }
        return arr;
    }
    // The function above has a time complexity of O(n)
    
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5};

        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println("Reversed Array : " + Arrays.toString(reverseArray(arr)));

    }
}