package Weekend;

public class CountAlphabets {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String str = scn.next();

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // if (Character.isAlphabetic(ch) == true)
            if (ch >= 'a' && ch <= 'z') {
                cnt++;
            } else if (ch >= 'A' && ch <= 'Z') {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
