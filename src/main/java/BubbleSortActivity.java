import java.util.Random;

public class BubbleSortActivity{

    public static void bubble_sort(int[] a)
    {
        int numSwaps = Integer.MAX_VALUE;

        while (numSwaps !=  0){
            // For each element except for the last
            numSwaps = 0;
            for(int i = 0; i < a.length - 1; ++i) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                    numSwaps += 1;
                }
            }
        }
    }


    public static void swap(int[] a, int i, int j ){
        int swappedValue = a[i];
        a[i] = a[j];
        a[j] = swappedValue;
    }


    public static void main( String[] args )
    {
        Random r = new Random();
        int[] arr = new int[10];
        int i;

        // Fill up the array with random numbers
        for ( i=0; i<arr.length; i++ )
            arr[i] = 1 + r.nextInt(100);

        // Display it
        System.out.print("before: ");
        for ( i=0; i<arr.length; i++ )
            System.out.print( arr[i] + " " );
        System.out.println();

        // Sort it
        bubble_sort(arr);

        // Display it again to confirm that it's sorted
        System.out.print("after : ");
        for ( i=0; i<arr.length; i++ )
            System.out.print( arr[i] + " " );
        System.out.println();
    }
}
