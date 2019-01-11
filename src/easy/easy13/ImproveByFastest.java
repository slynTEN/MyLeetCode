package easy.easy13;

/**
 * Created by teds on 12/20/2018.
 */
public class ImproveByFastest {
    public static int romanToInt(String s) {
        int result = 0, length = s.length();
        char[] chars = s.toCharArray();
        for (int i = 0; i < length; i++) {
            char c = chars[i];
            switch (c) {
                case 'M' :
                    result += 1000;
                    break;
                case 'D' :
                    result += 500;
                    break;
                case 'C' :
                    if(i + 1 < length) {
                        if(chars[i + 1] == 'M' || chars[i + 1] == 'D') {
                            result -= 100;
                            break;
                        }
                    }
                    result += 100;
                    break;
                case 'L' :
                    result += 50;
                    break;
                case 'X' :
                    if(i + 1 < length) {
                        if(chars[i + 1] == 'C' || chars[i + 1] == 'L') {
                            result -= 10;
                            break;
                        }
                    }
                    result += 10;
                    break;
                case 'V' :
                    result += 5;
                    break;
                case 'I' :
                    if(i + 1 < length) {
                        if(chars[i + 1] == 'X' || chars[i + 1] == 'V') {
                            result -= 1;
                            break;
                        }
                    }
                    return result + length - i;
            }
        }
        return result;
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
