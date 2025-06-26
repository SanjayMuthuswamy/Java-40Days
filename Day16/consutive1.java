public class consutive1 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1 };

        int c = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                c++;
            } else {
                if (max < c) {
                    max = c;
                }
                c = 0;
            }

        }
        System.out.println(max < c ? c : max);
    }
}
