package easy.easy13;

/**
 * Created by teds on 12/20/2018.
 */
public class Fastest {
    public static int romanToInt(String s) {
        if("".equals(s) || null == s) {
            return 0;
        }
        //transform String to char array
        char[] chars = s.toCharArray();
        int sum = 0;
        for(int i = 0; i < chars.length; i++){
            switch (chars[i]) {
                case 'I':
                    if(i + 1 == chars.length) {
                        sum += 1;
                        break;
                    } else{
                        if(chars[i + 1] == 'V' || chars[i + 1] == 'X'){
                            sum -= 1;
                        } else{
                            sum += 1;
                        }
                        break;
                    }
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    if(i + 1 == chars.length) {
                        sum += 10;
                        break;
                    } else{
                        if(chars[i + 1] == 'L' || chars[i + 1] == 'C'){
                            sum -= 10;
                        } else {
                            sum += 10;
                        }
                        break;
                    }
                case 'L':
                    sum +=50;
                    break;
                case 'C':
                    if(i + 1 == chars.length) {
                        sum += 100;
                        break;
                    } else{
                        if(chars[i + 1] == 'D' || chars[i + 1] == 'M'){
                            sum -= 100;
                        } else{
                            sum += 100;
                        }
                        break;
                    }
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
                default:
                    return 0;
            }
        }
        return sum;
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
