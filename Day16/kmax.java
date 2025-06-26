import java.util.*;

public class kmax {
    public static void main(String[] args) {
        Scanner s=  new Scanner (System.in);  
        int[] arr = {1, 2, 3, 4, 5, 6 , 7};
        int k = s.nextInt();

        for (int i = 0; i <= arr.length - k; i++) {
            System.out.println (Arrays.stream(Arrays.copyOfRange(arr, i, i + k)).max().getAsInt());
        }
    }
}
