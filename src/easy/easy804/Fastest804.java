package easy.easy804;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by teds on 11/29/2018.
 */
public class Fastest804 {
    public static int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for(String word : words) {
            StringBuilder morse1 = new StringBuilder();
            int length = word.length();
            for(int i = 0; i < length; i++) {
                morse1.append(marks[word.charAt(i) - 97]);
            }
            set.add(morse1.toString());
        }
        return set.size();
    }
    public static String[] marks = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
}
