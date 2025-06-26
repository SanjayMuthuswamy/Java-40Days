package RECURSION;
import java.util.*; 

public class arraysum {
    private static int i;

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9}; 
        int n = arr.length;

        System.out.println( + arrsum(arr, n)); 
    }

    public static int arrsum(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {           
            i = arr[n - 1] + arrsum(arr, n - 1);
            return i;
        }
    }
}  
