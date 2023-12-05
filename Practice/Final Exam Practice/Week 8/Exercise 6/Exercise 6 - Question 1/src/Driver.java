public class Driver {

    public static void showFibonacci(int n)
    {
       for (int i = 0; i<n ; i++) {
           System.out.print(finbonacci(i) + " ");
       }
    }


    public static int finbonacci(int n)
    {
        if (n ==0 || n==1)
        {
            return n;
        }
        else
        {
            return finbonacci(n-1) + finbonacci( n-2);
        }
        // Time complexity for the function above is O(2^n)
    }



    public static void main(String[] args) {

        int i = 10;
        System.out.println(i + " Fibonacci numbers are : ");
        showFibonacci(i);
    }
}