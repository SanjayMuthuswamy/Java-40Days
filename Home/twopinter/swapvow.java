package twopinter;
public class swapvow {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);

        String str = s.nextLine();
        char[] arr = str.toCharArray();
        char[] arr_2 = new char[100];

        int indx = 0;

        for (int i = arr.length -1 ; i >= 0; i--) {
            if (isVowel(arr[i])) {
                arr_2[indx++] = arr[i];
            }
        }
        indx = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(arr[i])) {
                arr[i] = arr_2[indx++];
            }
        }
        System.out.println(new String(arr));
    }

    public static boolean isVowel(char c) {
        c= Character.toLowerCase(c); 
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
