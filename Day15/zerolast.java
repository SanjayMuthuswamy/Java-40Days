public class zerolast {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in); 

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = s.nextInt(); 
        }

        int[] result = new int[arr.length];

        // Start recursive function and get the number of non-zero elements
        int index = pushNonZeros(arr, 0, result, 0); 

        // Fill remaining with zeros
        fillzero(result, index);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int pushNonZeros(int[] arr, int idx, int[] result, int residx) {
        if (idx == arr.length) {
            return residx;  // return how many non-zero values were added
        }

        if (arr[idx] != 0) {
            result[residx] = arr[idx];
            residx++;
        }

        return pushNonZeros(arr, idx + 1, result, residx);
    }

    public static void fillzero(int[] result, int st) {
        if (st == result.length) {
            return;
        }
        result[st] = 0;
        fillzero(result, st + 1);
    }
}
