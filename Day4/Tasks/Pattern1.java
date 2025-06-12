package Day4.Tasks;

public class Pattern1 {
    /* 1
     * 2 2 
     * 3 3 3 
     * 4 4 4 4
     */
    public static void main(String[] args) {
        int n = 4; // Number of rows
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
                
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
