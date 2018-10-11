package easy.easy771;

/**
 * Created by teds on 9/27/2018.
 */
public class Solution709 {
    static public String toLowerCase(String str) {
        StringBuffer ss = new StringBuffer();
        for(char s : str.toCharArray()) {
            if(s<91 & s>64)
                ss.append((char)(s+32));
            else
                ss.append(s);
        }
        return ss.toString();
    }
    public static void main(String[] args) {
        String J = "Hello";
        System.out.println(toLowerCase(J));
    }
}
