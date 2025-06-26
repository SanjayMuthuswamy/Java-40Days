import java.util.Scanner;

public class arrayele {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        // System.out.println(num.length);

        printelelements(num, 0);
    }

    public static void printelelements(int[] a, int idx) {
        if (idx >= 10) return;

        System.out.print(a[idx] + " ");
        printelelements(a, idx + 1);
    }
}
