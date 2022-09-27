import java.util.*;

public class kAnagrams {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        String str1 = scn.next();
        String str2 = scn.next();

        if (str1.length() != str2.length()) {
            System.out.println(0);
            return;
        }

        int[] freq1 = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            freq1[ch - 'a'] += 1;
        }

        int[] freq2 = new int[26];
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            freq2[ch - 'a'] += 1;
        }

        int extras = 0;
        for (int i = 0; i < 26; i++) {
            int f1 = freq1[i];
            int f2 = freq2[i];
            if (f2 > f1) {
                extras += (f2 - f1);
            }
        }

        if (extras <= k) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
