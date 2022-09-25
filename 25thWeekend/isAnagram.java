import java.util.*;

public class isAnagram {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();

        // char[] arr1 = str1.toCharArray ();
        // char[] arr2 = str2.toCharArray ();

        // Arrays.sort (arr1);
        // Arrays.sort (arr2);

        // str1 = new String (arr1);
        // str2 = new String (arr2);

        // if (str1.equals(str2) == true)
        // {
        // System.out.println("Yes");
        // }
        // else
        // {
        // System.out.println("No");
        // }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            freq1[ch - 'a'] += 1;
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            freq2[ch - 'a'] += 1;
        }

        boolean isSame = true;
        for (int i = 0; i < freq1.length; i++) {
            if (freq1[i] != freq2[i]) {
                isSame = false;
            }
        }

        if (isSame == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
