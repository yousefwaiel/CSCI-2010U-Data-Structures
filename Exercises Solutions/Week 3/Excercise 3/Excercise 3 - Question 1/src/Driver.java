import java.util.Arrays;

public class Driver {
    public static int getSecondLargest(int[] arr)
    {
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

    // Time complexity of above functio is O(nlogn), as stated in the official java documentation
    public static void main(String[] args) {

        int arr[] = new int[]{1,4,3,2,5};
        System.out.println("Original List : " + Arrays.toString(arr));
        System.out.println("Second largest element : " + getSecondLargest(arr));

    }
}