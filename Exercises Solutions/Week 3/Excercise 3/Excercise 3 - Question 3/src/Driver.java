import java.util.Arrays;

public class Driver {

    public static int missingElement(int arr[])
    {
        int element = 0;

        int n = arr.length;
        int totalSum = n * (n+1) / 2;

        int actualSum = 0;
        for(int i=0; i<n; i++)
        {
            actualSum+=arr[i];
        }

        return totalSum-actualSum;
    }

    // Function above has time complexity of O(n)

    public static void main(String[] args) {
    int[] arr = {0,1,2,3,5,6,7};

    System.out.println("Original list : " + Arrays.toString(arr));
    System.out.println("Missing element : " + missingElement(arr));
    }
}