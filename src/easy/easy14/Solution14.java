package easy.easy14;

/**
 * Created by teds on 12/24/2018.
 */
public class Solution14 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        String result = "";
        int size = strs[0].length();
        for(String str : strs) {
            if(str.length() < size)
                size = str.length();
        }
        for(int i = 0; i < size; i++) {
            char c = strs[0].charAt(i);
            for(String str : strs) {
                if(str.charAt(i) != c) {
                    return result;
                }
            }
            result += c;
        }
        return result;
    }

    public static String longestCommonPrefixPromote(String[] strs) {
        if(strs == null || strs.length == 0)
            return "";
        for(int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for(String str : strs) {
                if(str.length() == i || str.charAt(i) != c) {
                    return str.substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        String [] s = {"flower","flow","flight"};
        assert (longestCommonPrefix(s).equals("fl"));
        String [] s2 = {"dog","racecar","car"};
        assert (longestCommonPrefix(s2).equals(""));
        assert (longestCommonPrefixPromote(s).equals("fl"));
        assert (longestCommonPrefixPromote(s2).equals(""));
    }
}
