import java.util.Scanner;

public class BetrothedPair {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        if ((sumOfProperDivisors(a) == b + 1) && (sumOfProperDivisors(b) == a + 1)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static int sumOfProperDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
