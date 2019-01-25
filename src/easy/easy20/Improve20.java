package easy.easy20;

/**
 * Created by teds on 1/17/2019.
 */
public class Improve20 {

    public static boolean isValid(String s) {
        int [] stack = new int[s.length()];
        int index = 0;
        for(char c : s.toCharArray()) {
            switch (c) {
                case '(':
                    stack[index++] = 1;
                    break;
                case ')':
                    if(index == 0) {
                        return false;
                    }
                    if(stack[index - 1] == 1) {
                        index--;
                    } else {
                        return false;
                    }
                    break;
                case '[':
                    stack[index++] = 2;
                    break;
                case ']':
                    if(index == 0) {
                        return false;
                    }
                    if(stack[index - 1] == 2) {
                        index--;
                    } else {
                        return false;
                    }
                    break;
                case '{':
                    stack[index++] = 3;
                    break;
                case '}':
                    if(index == 0) {
                        return false;
                    }
                    if(stack[index - 1] == 3) {
                        index--;
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return index == 0;
    }

    public static void main(String[] args) {
        String s = "()";
        assert (isValid(s) == true);
        s = "()[]{}";
        assert (isValid(s) == true);
        s = "(]";
        assert (isValid(s) == false);
        s = "([)]";
        assert (isValid(s) == false);
        s = "{[]}";
        assert (isValid(s) == true);
    }
}
