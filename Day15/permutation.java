import java.util.Scanner;

public class permutation {
    static int count = 0;  // Global counter

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a =  s.nextInt() ; 
        String str  =  Integer.toString(a) ; 
        System.out.println("Total permutations: " + count);

        permu(str, "");
    }

    public static void permu(String s, String a) {
        if (s.isEmpty()) {
            count++;  // Increment count
            System.out.println( count + " " + a);  // Print number + permutation
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String r = s.substring(0, i) + s.substring(i + 1);
            permu(r, a + c);
        }
    }
}
