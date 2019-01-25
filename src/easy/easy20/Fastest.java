package easy.easy20;

/**
 * Created by teds on 1/17/2019.
 */
public class Fastest {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        char c = 0;
        int i;
        for (i = 0; i < s.length(); i++) {
            c = s.charAt(0);
            if (c != '\0') {
                break;
            }
        }
        char[] array = new char[s.length()];
        int topIndex = 0;
        array[topIndex++] = c;
        if (c == '(' || c == '[' || c == '{') {
            for (int j = i + 1; j < s.length(); j++) {
                c = s.charAt(j);
                if (topIndex >= 1) {
                    char temp = array[topIndex - 1];
                    if ((c == ')' && temp == '(') || (c == ']' && temp == '[' || (c == '}' && temp == '{'))) {
                        array[topIndex - 1] = 0;
                        topIndex--;
                    } else {
                        array[topIndex] = c;
                        topIndex++;
                    }
                } else {
                    array[topIndex] = c;
                    topIndex++;
                }
            }
            return topIndex == 0;
        }
        return false;
    }
}
