package Contest;

public class Ques1 {
    public static String toggle(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') // means uppercase, so convert to lowercase
            {
                ans += Character.toLowerCase(ch);
                // ans += (char)(ch - 'A' + 'a');
            } else if (ch >= 'a' && ch <= 'z') {
                ans += Character.toUpperCase(ch);
            } else {
                ans += ch;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String str = scn.next();

        String ans = toggle(str);
        System.out.println(ans);
    }
}
