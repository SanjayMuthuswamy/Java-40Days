import java.util.Scanner;

public class combination {
    static int count = 0;  // Global counter

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "abcd";
        combin(str, "");
        System.out.println("Total combinations: " + count);
    }

    public static void combin(String s, String a) {

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String r = s.substring(i + 1);

            String newCombo = a + c;            
            System.out.println(" -> " + newCombo);

            combin(r, newCombo);  
        }
    }
}
