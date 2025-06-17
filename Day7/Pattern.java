package Day7;
public class Pattern {
    public static void main(String[] args) {
        int n = 9; // Size of the 'S'

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n / 2 || i == n - 1) {
                // Full bar at top, middle, bottom
                System.out.println(" *********");
            } else if (i < n / 2) {
                // Left side vertical
                System.out.println("*");
            } else {
                // Right side vertical
                System.out.println("         *");
            }
        }
    }
}