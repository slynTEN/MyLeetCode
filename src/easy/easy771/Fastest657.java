package easy.easy771;

/**
 * Created by teds on 10/11/2018.
 */
public class Fastest657 {
    public boolean judgeCircle(String moves) {
        int l = 0, r = 0, u = 0, d = 0;
        for(int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            if(c == 'L')
                l++;
            else if(c == 'R')
                r++;
            else if(c == 'U')
                u++;
            else
                d++;
        }
        return l == r && u == d;
    }
    public static void main(String[] args) {

        Fastest657 fastest657 = new Fastest657();
        String moves = "UL";
        System.out.println(fastest657.judgeCircle(moves));
        moves = "UD";
        System.out.println(fastest657.judgeCircle(moves));
    }
}
