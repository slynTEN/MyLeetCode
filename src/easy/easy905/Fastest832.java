package easy.easy905;

import java.util.Arrays;

/**
 * Created by teds on 10/9/2018.
 */
public class Fastest832 {
    public int[][] flipAndInvertImage(int[][] A) {
        int fl = A.length;
        int sl = A[0].length;
        int [][]B = new int[fl][sl];
        for(int i=0; i<fl; i++) {
            for(int j=0; j<sl; j++) {
                B[i][sl-1-j] = 1 - A[i][j];
            }
        }
        return B;
    }
    public static void main(String[] args) {
        Fastest832 fastest832 = new Fastest832();
        int A[][] = {{1,1,0},{1,0,1},{0,0,0}};
        int B[][] = fastest832.flipAndInvertImage(A);
        for(int i=0; i<B.length; i++) {
            System.out.println(Arrays.toString(B[i]));
        }
    }
}
