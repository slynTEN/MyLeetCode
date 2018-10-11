package easy.easy461;

/**
 * Created by teds on 10/9/2018.
 */
public class Solution461 {
    public int hammingDistance(int x, int y) {
        int z = x ^ y, i = 0;
        while(z > 0) {
            if(z % 2 == 1) {
                i++;
            }
            z /= 2;
        }
        return i;
    }
    public static void main(String[] args) {
        Solution461 solution461 = new Solution461();
        int x = 1, y = 4;
        System.out.println(solution461.hammingDistance(x, y));
    }
}
