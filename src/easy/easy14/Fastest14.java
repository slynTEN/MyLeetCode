package easy.easy14;

/**
 * Created by teds on 1/17/2019.
 */
public class Fastest14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }

        int min = strs[0].length();
        String minStr = "";
        for (String str : strs) {
            if (str.length() <= min) {
                min = str.length();
                minStr = str;
            }
        }

        for (int size = min; size >= 1; size--) {
            for (int j = 0; j + size <= min; j++) {
                String sub = minStr.substring(j, j + size);
                boolean isFind = true;
                for (String s : strs) {
                    if (s.indexOf(String.valueOf(sub)) != 0) {
                        isFind = false;
                    }
                }
                if (isFind) {
                    return sub;
                }
            }
        }

        boolean isFind = true;
        for (char s : minStr.toCharArray()) {
            for (String str : strs) {
                if (str.indexOf(String.valueOf(s)) != 0) {
                    isFind = false;
                }
            }
            if (isFind) {
                return String.valueOf(s);
            }
        }
        return "";
    }

}
