package easy.easy7;

/**
 * Created by teds on 12/19/2018.
 */
public class Fastest7 {
    public static int reverse(int x) {
        long l = 0;
        while(x != 0) {
            l = l * 10 + x % 10;
            x /= 10;
        }
        if(l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)l;
    }
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
    }
}
