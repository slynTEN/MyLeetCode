package easy.easy804;

/**
 * Created by teds on 11/29/2018.
 */
public class Solution804 {
    public static int uniqueMorseRepresentations(String[] words) {
        String[] trans = new String[words.length];
        int size = 0;
        for(String word : words) {
            String morse1 = "";
            for(int i = 0; i < word.length(); i++) {
                morse1 += marks[word.charAt(i) - 97];
            }
            for(int i = 0; i < size; i++) {
                if(trans[i].equals(morse1)) {
                    morse1 = "";
                    break;
                }
            }
            if(!morse1.equals("")) {
                trans[size++] = morse1;
            }
        }
        return size;
    }
    public static String[] marks = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
}
