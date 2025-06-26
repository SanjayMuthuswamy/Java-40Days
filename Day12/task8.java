package Day12;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine().toLowerCase();
        char[] a = str.toCharArray();
        char count = 'b'; // Start replacing vowels from 'b'

        for (int i = 0; i < a.length; i++) {
            if (isvowel(a[i])) {
                while (isvowel(count)) {
                    count++; // Skip vowels while replacing
                } 
                a[i] = count;
                count++; 
            }
        }

        System.out.println(new String(a));
    }

    public static boolean isvowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
