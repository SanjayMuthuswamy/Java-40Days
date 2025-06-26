import java.util.Scanner;

public class prblm1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if (isMagicalNumber(a)) {
            System.out.println(a + " is a Magical Number");
        } else {
            System.out.println(a + " is NOT a Magical Number");
        }
    }

    public static boolean isMagicalNumber(int num) {
        int sum = num;
        while (sum >= 10) {
            sum = digitSum(sum);
        }
        return sum == 1;
    }

    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
