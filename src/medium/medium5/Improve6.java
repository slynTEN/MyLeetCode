package medium.medium5;

public class Improve6 {
    /*
    事实上，只需使用恒定的空间，我们就可以在 O(n^2)O(n 2 ) 的时间内解决这个问题。

我们观察到回文中心的两侧互为镜像。因此，回文可以从它的中心展开，并且只有 2n - 12n−1 个这样的中心。

你可能会问，为什么会是 2n - 12n−1 个，而不是 nn 个中心？原因在于所含字母数为偶数的回文的中心可以处于两字母之间（例如 \textrm{“abba”}“abba” 的中心在两个 \textrm{‘b’}‘b’ 之间）。
     */
    private static String longestPalindrome(String s) {
        if(s == null || s.isEmpty()) {
            return "";
        }
        int begin = 0, end = 0;
        for(int i = 0; i < s.length(); i++) {
            int length1 = expandFromMid(s, i, i);
            int length2 = expandFromMid(s, i, i+1);
            int length = Math.max(length1, length2);
            if(length > end - begin) {
                begin = i - (length - 1)/2;
                end = i + length/2 + 1;
            }

        }
        return s.substring(begin, end);
    }

    private static int expandFromMid(String s, int Left, int Right) {
        int L = Left, R = Right;
        while(L > -1 && R < s.length()) {
            if(s.charAt(L) != s.charAt(R)) {
                return R - L -1;
            }
            L--;
            R++;
        }
        return R - L - 1;
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
