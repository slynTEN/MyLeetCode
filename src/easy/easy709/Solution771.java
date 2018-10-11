package easy.easy771;

/**
 * Created by teds on 9/27/2018.
 */
public class Solution771 {
    static public int numJewelsInStones(String J, String S) {
        int i=0;
        for(int m=0; m<S.length(); m++) {
            if(J.indexOf(S.charAt(m)) != -1) {
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        String J = "aA", S = "aAAbbbb";
        System.out.println(numJewelsInStones(J, S));
    }
}
