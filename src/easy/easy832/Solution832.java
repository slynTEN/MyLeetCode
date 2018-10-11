package easy.easy832;

import java.util.Arrays;

/**
 * Created by teds on 10/9/2018.
 */
public class Solution832 {
    public int[][] flipAndInvertImage(int[][] A) {
        int sl = A[0].length;
        int [][]B = new int[A.length][sl];
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<sl; j++) {
                B[i][sl-1-j] = 1 - A[i][j];
            }
        }
        return B;
    }
    public static void main(String[] args) {
        Solution832 solution832 = new Solution832();
        int A[][] = {{1,1,0},{1,0,1},{0,0,0}};
        int B[][] = solution832.flipAndInvertImage(A);
        for(int i=0; i<B.length; i++) {
            System.out.println(Arrays.toString(B[i]));
        }
    }
}
