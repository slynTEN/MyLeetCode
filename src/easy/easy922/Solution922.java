package easy.easy922;

/**
 * Created by teds on 12/5/2018.
 */
public class Solution922 {

    public static int[] sortArrayByParityII(int[] A) {
        int length = A.length, index0 = 0, index1 = 1;
        int[] B = new int[length];

        for(int i = 0; i < length; i++) {
            int a = A[i];
            if((a & 1) == 0) {
                B[index0] = a;
                index0 += 2;
            } else {
                B[index1] = a;
                index1 += 2;
            }
        }
        return B;
    }

    public static void main(String[] args) {
        int[] A = {4,2,5,7};
        for(int a : sortArrayByParityII(A)) {
            System.out.print(a + ", ");
        }
    }
}
