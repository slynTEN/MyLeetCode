package medium.medium5;

public class Solution5 {
    private static String longestPalindrome(String s) {
        if(s == null || s.isEmpty()) {
            return "";
        }
        int max = 1;
        String maxString = s.substring(0, 1);
        for(int i = 0; i < s.length(); i++) {
            for(int j = s.length(); j > i + max; j--) {
                String subString = s.substring(i, j);
                int subLength = s.length();
                if(isPalindrome(subString)) {
                    max = subLength;
                    maxString = subString;
                    break;
                }
            }
        }
        return maxString;
    }

    private static boolean isPalindrome(String s) {
        boolean isPalindrome = true;
        int subLength = s.length();
        for(int k = 0; k < subLength; k++) {
            if(s.charAt(k) != s.charAt(subLength - 1 - k)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        String testS = "babad";
        assert (longestPalindrome(testS).equals("bab") || longestPalindrome(testS).equals("aba"));
        testS = "cbbd";
        assert (longestPalindrome(testS).equals("bb") || longestPalindrome(testS).equals("bb"));
        testS = "a";
        assert (longestPalindrome(testS).equals("a") || longestPalindrome(testS).equals("a"));
    }
}
