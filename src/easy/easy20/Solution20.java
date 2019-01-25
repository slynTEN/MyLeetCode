package easy.easy20;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by teds on 1/17/2019.
 */
public class Solution20 {

    public static boolean isValid(String s) {
        List<Integer> stack = new ArrayList<>();
        for(char c : s.toCharArray()) {
            switch (c) {
                case '(':
                    stack.add(1);
                    break;
                case ')':
                    if(stack.size()==0) {
                        return false;
                    }
                    if(stack.get(stack.size() - 1) == 1) {
                        stack.remove(stack.size() - 1);
                    } else {
                        return false;
                    }
                    break;
                case '[':
                    stack.add(2);
                    break;
                case ']':
                    if(stack.size()==0) {
                        return false;
                    }
                    if(stack.get(stack.size() - 1) == 2) {
                        stack.remove(stack.size() - 1);
                    } else {
                        return false;
                    }
                    break;
                case '{':
                    stack.add(3);
                    break;
                case '}':
                    if(stack.size()==0) {
                        return false;
                    }
                    if(stack.get(stack.size() - 1) == 3) {
                        stack.remove(stack.size() - 1);
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return stack.size()==0;
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
