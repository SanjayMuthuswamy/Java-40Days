package Day12;

import java.util.Arrays;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        String str1 = s.nextLine();

        // Optional: Remove spaces and convert to lowercase for case-insensitive anagram check
        str = str.replaceAll("\\s", "").toLowerCase();
        str1 = str1.replaceAll("\\s", "").toLowerCase();

        if (str.length() != str1.length()) {
            System.out.println("Not an anagram");
            return;
        }

        char[] ch1 = str.toCharArray();
        char[] ch2 = str1.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("It's an anagram");
        } else {
            System.out.println("Not an anagram");
        }
    }
}
