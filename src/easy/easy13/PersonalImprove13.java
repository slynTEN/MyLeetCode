package easy.easy13;

/**
 * Created by teds on 12/20/2018.
 */
public class PersonalImprove13 {
    public static int romanToInt(String s) {
        int result = 0, i = 0, length = s.length();
        while (i < length) {
            char c = s.charAt(i);
            switch (c) {
                case 'M' :
                    result += 1000;
                    break;
                case 'D' :
                    result += 500;
                    break;
                case 'C' :
                    if(i + 1 < length) {
                        if(s.charAt(i + 1) == 'M') {
                            result += 900;
                            i++;
                            break;
                        } else if(s.charAt(i + 1) == 'D') {
                            result += 400;
                            i++;
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
                        if(s.charAt(i + 1) == 'C') {
                            result += 90;
                            i++;
                            break;
                        } else if(s.charAt(i + 1) == 'L') {
                            result += 40;
                            i++;
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
                        if(s.charAt(i + 1) == 'X') {
                            result += 9;
                            i++;
                            break;
                        } else if(s.charAt(i + 1) == 'V') {
                            result += 4;
                            i++;
                            break;
                        }
                    }
                    return result + length - i;
            }
            i++;
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
