import java.time.chrono.MinguoChronology;
import java.util.*;

public class largestsum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        larg_seq(size, arr);
    }

    public static void larg_seq(int size, int[] arr) {
        int fixed_sum = Integer.MIN_VALUE;
        int j = 0;
        int idx_end = 0;
        int idx_st = 0;

        for (int i = 0; i < size; i++) {
            int larg_sum = 0;
            for (j = i; j < size; j++) {
                larg_sum = arr[j] + larg_sum;
                if (larg_sum > fixed_sum) {
                    fixed_sum = larg_sum;
                    idx_st = i;
                    idx_end = j;
                }
            }
        }
        
        System.out.println(idx_st + "->" + idx_end + "\n" + fixed_sum);
    }
}
