package easy.easy9;

/**
 * Created by teds on 12/19/2018.
 */
public class fastest {
    public static boolean isPalindrome(int x) {
        //排除特殊情况
        if(x < 0 || (x % 10 == 0 && x != 0))
            return false;
        int revert = 0;
        //将数字拆成位数相同或revert位数大一位的两部分，revert为倒序
        while(x > revert) {
            revert = revert * 10 + x % 10;
            x /= 10;
        }
        //若revert大一位，则revert最后一位为中位，不影响
        return (x == revert || x == revert / 10);
    }
    public static void main(String[] args) {
        int x = 1221;
        System.out.println(isPalindrome(x));
    }
}
