import java.util.Scanner;

public class sumofalternative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // String str = s.nextLine() ;
        int a = s.nextInt();

        System.out.println(fn_name(a));

    }

    public static int fn_name(int a) {
        if (a == 0) {
            return 0;
        }
        return a % 10 + fn_name((a / 100)) * 10;
    }
}
// alternative digit
