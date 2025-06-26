package Day12;
import java.util.*;

//Upper case , Lower Case , Special case

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int upper_case = 0;
        int lower_case = 0;
        int specl_case = 0;
        int numbers = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                System.out.println("Digit Case     : " + c);
                numbers++;
            } else if (Character.isUpperCase(c)) {
                System.out.println("Upper Case     : " + c);
                upper_case++;
            } else if (Character.isLowerCase(c)) {
                System.out.println("Lower Case     : " + c);
                lower_case++;
            } else {
                System.out.println("Special Case   : " + c);
                specl_case++;
            }
        }
    
        System.out.println("Upper Case Letters   : " + upper_case);
        System.out.println("Lower Case Letters   : " + lower_case);
        System.out.println("Digits               : " + numbers);
        System.out.println("Special Characters   : " + specl_case);
    }
}
