package easy.easy657;

/**
 * Created by teds on 10/11/2018.
 */
public class Solution657 {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for(int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            if(c == 'L')
                x--;
            else if(c == 'R')
                x++;
            else if(c == 'U')
                y++;
            else
                y--;
        }
        return x == 0 && y == 0;
    }
    public static void main(String[] args) {

        Solution657 solution657 = new Solution657();
        String moves = "UL";
        System.out.println(solution657.judgeCircle(moves));
        moves = "UD";
        System.out.println(solution657.judgeCircle(moves));
    }
}
