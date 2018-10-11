package easy.easy461;

/**
 * Created by teds on 10/9/2018.
 */
public class Fastest461 {
    public int hammingDistance(int x, int y) {
        int z = x ^ y, i = 0;
        while(z > 0) {
            i += (z & 1);
            z >>= 1;
        }
        return i;
    }
    public static void main(String[] args) {
        Fastest461 fastest461 = new Fastest461();
        int x = 1, y = 4;
        System.out.println(fastest461.hammingDistance(x, y));
    }
}
