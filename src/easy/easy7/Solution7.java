package easy.easy7;

/**
 * Created by teds on 12/19/2018.
 */
public class Solution7 {
    public static int reverse(int x) {
        StringBuilder builder = new StringBuilder();
        String chars = Integer.toString(x);
        int end = -1;
        if(x < 0) {
            builder.append('-');
            end = 0;
        }
        for(int i = chars.length() - 1; i > end; i-- ) {
            builder.append(chars.charAt(i));
        }
        long l = Long.parseLong(builder.toString());
        if(l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
            return 0;
        }
        return Integer.parseInt(builder.toString());
    }
    public static void main(String[] args) {
        int x = -2147483648;
        System.out.println(reverse(x));
    }
}
