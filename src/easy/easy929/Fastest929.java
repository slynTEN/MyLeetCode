package easy.easy929;

import java.util.HashSet;

/**
 * Created by teds on 11/9/2018.
 */
public class Fastest929 {
    static public int numUniqueEmails(String[] emails) {
        HashSet hashSet = new HashSet();
        for(int i = 0; i < emails.length; i++) {
            String before, after;
            String email = emails[i];
            int length = email.length();
            while(email.charAt(--length) != '@');
            after = email.substring(length);
            StringBuilder builder = new StringBuilder();
            for(int j = 0; j < length && email.charAt(j) != '+'; j++) {
                if(email.charAt(j) != '.') {
                    builder.append(email.charAt(j));
                }
            }
            before = builder.toString();
            hashSet.add(before + after);
        }
        return hashSet.size();
    }
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }
}
