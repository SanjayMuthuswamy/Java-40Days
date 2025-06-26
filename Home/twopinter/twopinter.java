package twopinter;
public class twopinter {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        String str = s.nextLine();

        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        char temp;
        while (left < right) { // while (left<=right)
            // if (isVowel(arr[left]) && isVowel(arr[right])) {
            // temp = arr[left];
            // arr[left] = arr[right];
            // arr[right] = temp;
            // }
            // left++;
            // right--;

            if (!isVowel(arr[left])) {
                left++;
            } else if (!isVowel(arr[right])) {
                right--;
            } else {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                right--;
                left++;
            }
        }
        System.out.println(new String(arr));
    }

    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
