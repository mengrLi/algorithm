package IsSubsequence;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;

        int i = 0;
        for (int j = 0; j < t.length(); j++) {
            if (t.charAt(j) - s.charAt(i) == 0) {
                i ++;
                if (i == s.length()) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println( isSubsequence("abc","aertbwwc"));


    }
}
