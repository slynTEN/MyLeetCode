package easy.easy905;

import java.util.Arrays;

/**
 * Created by teds on 9/28/2018.
 */
public class Solution905 {
    static public int[] sortArrayByParity(int[] A) {
        int len = A.length;
        int [] b = new int[len];
        int left = 0;
        int right = len - 1;
        for(int i=0; i<len; i++) {
            int s = A[i];
            if(s % 2 == 0)
                b[left++] = s;
            else
                b[right--] = s;
        }
        return b;
    }
    public static void main(String[] args) {
        int [] J = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(J)));
    }
}
