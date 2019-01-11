package easy.easy13;

/**
 * Created by teds on 12/20/2018.
 */
public class Solution13 {
    public static int romanToInt(String s) {
        int result = 0, i = 0;
        char c = s.charAt(0);
        int length = s.length(), length_1 = length - 1;

        while(i < length) {
            c = s.charAt(i);
            if(c == 'M') {
                result += 1000;
            } else if(c == 'D') {
                result += 500;
            } else {
                break;
            }
            i++;
        }
        if(c == 'C' && i < length_1) {
            if(s.charAt(i + 1) == 'M') {
                result += 900;
                i += 2;
                if(i == length)
                    return result;
            } else if(s.charAt(i + 1) == 'D') {
                result += 400;
                i += 2;
                if(i == length)
                    return result;
            }
        }

        while(i < length) {
            c = s.charAt(i);
            if(c == 'C') {
                result += 100;
            } else if(c == 'L') {
                result += 50;
            } else {
                break;
            }
            i++;
        }
        if(c == 'X' && i < length_1) {
            if(s.charAt(i + 1) == 'C') {
                result += 90;
                i += 2;
                if(i == length)
                    return result;
            } else if(s.charAt(i + 1) == 'L') {
                result += 40;
                i += 2;
                if(i == length)
                    return result;
            }
        }

        while(i < length) {
            c = s.charAt(i);
            if(c == 'X') {
                result += 10;
            } else if(c == 'V') {
                result += 5;
            } else {
                break;
            }
            i++;
        }
        if(c == 'I' && i < length_1) {
            if(s.charAt(i + 1) == 'X') {
                result += 9;
                i += 2;
            } else if(s.charAt(i + 1) == 'V') {
                result += 4;
                i += 2;
            }
        }

        return result + s.length() - i;
    }
    public static void main(String[] args) {
        String s = "III";
        assert (romanToInt(s) == 3);
        s = "IV";
        assert romanToInt(s) == 4;
        s = "IX";
        assert romanToInt(s) == 9;
        s = "LVIII";
        assert romanToInt(s) == 58;
        s = "MCMXCIV";
        assert romanToInt(s) == 1994;
        s = "CXC";
        assert romanToInt(s) == 190;
        s = "MMCDXXV";
        assert romanToInt(s) == 2425;
    }
}
