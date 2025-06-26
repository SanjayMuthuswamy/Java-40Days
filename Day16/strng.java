public class strng {
    public static void main(String[] args) {
        
        int num = 132;
        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += fact(digit);
            num /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is a Strong Number");
        } else {
            System.out.println(original + " is NOT a Strong Number");
        }
    }

    public static int fact(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * fact(n - 1);
    }
}
