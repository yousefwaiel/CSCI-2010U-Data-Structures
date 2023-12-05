import java.util.Arrays;

public class Driver {

    public static int partition(String[] strings, int start, int end)
    {
        String pivot = strings[end];
        int i = start - 1;

        for (int j= start; j< end; j++)
        {
            if (strings[j].compareTo(pivot) < 0)
            {
                i++;
                String temp = strings[i];
                strings[i] = strings[j];
                strings[j] = temp;
            }
        }
        i++;
        String temp = strings[i];
        strings[i] = pivot;
        strings[end] = temp;
        return i;
    }



    public static void quickSort(String[] strings, int start, int end)
    {
        if (start < end)
        {
            int pivotIndex = partition(strings, start,end);
            quickSort(strings, start, pivotIndex-1);
            quickSort(strings, pivotIndex + 1, end);
        }
    }




    public static void main(String[] args) {

        String[] cities = new String[] {"Toronto", "Ottaw", "Oshawa", "Whitby", "Ajax"};

        System.out.println(Arrays.toString(cities));

        quickSort(cities,0, cities.length-1);

        System.out.println(Arrays.toString(cities));

    }
}