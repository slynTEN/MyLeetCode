package easy.easy929;

/**
 * Created by teds on 11/5/2018.
 */
public class Solution929 {
    static public int numUniqueEmails(String[] emails) {
        String[] e2 = new String[emails.length];
        String[] sub;
        String after;
        int num=0, i;
        for(String email : emails) {
            sub = email.split("@");
            after = sub[0].split("\\+")[0].replaceAll("\\.", "") + sub[1];
            for(i=0; i<num; i++) {
                if(e2[i].equals(after)) {
                    break;
                }
            }
            if(i == num) {
                e2[num++] = after;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }
}
