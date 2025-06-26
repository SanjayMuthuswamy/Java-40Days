import java.util.Scanner;

public class strtoint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        System.out.println(fn_name(str));
    }

    public static String fn_name(String str) {
        if (str.isEmpty()) {
            return "";
        }

        int ascii = str.charAt(0);  
        return ascii + " " + fn_name(str.substring(1)); 
    }
}
