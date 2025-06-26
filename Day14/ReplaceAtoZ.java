import java.util.Scanner;

public class ReplaceAtoZ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.println(replaceAwithZ(str));
    }

    public static String replaceAwithZ(String a) {
        if (a.isEmpty()) {
            return "";
        }

        char firstChar = a.charAt(0);
        if (firstChar == 'a') {
            return  'z'+ replaceAwithZ(a.substring(1)) ;
        }

        return  a.substring(0,1)+replaceAwithZ(a.substring(1));
    }
}
