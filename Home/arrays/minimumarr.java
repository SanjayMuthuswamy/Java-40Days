package arrays;
import java.util.*;

public class minimumarr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        int[] sorted = Arrays.copyOf(arr, size);
        Arrays.sort(sorted);

        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            int nextGreater = -1;

            // find index of arr[i] in sorted[]
            for (int j = 0; j < size; j++) {
                if (sorted[j] == arr[i]) {
                    if (j + 1 < size) {
                        nextGreater = sorted[j + 1];
                    }
                    break;
                }
            }

            result[i] = nextGreater;
        }

        System.out.println(Arrays.toString(result));
    }
}
