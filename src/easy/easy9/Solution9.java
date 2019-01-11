package easy.easy9;

/**
 * Created by teds on 12/19/2018.
 */
public class Solution9 {
    public static boolean isPalindrome(int x) {
        String chars = Integer.toString(x);
        for(int i = 0; i <= chars.length() / 2; i++) {
            if(chars.charAt(i) != chars.charAt(chars.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int x = 1221;
        System.out.println(isPalindrome(x));
    }
}
