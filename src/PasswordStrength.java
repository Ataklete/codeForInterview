import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Q2
// find password strength
public class PasswordStrength {

    public static  int counts(String str){
//            System.out.println(str);
        int length =0;
        char[] chars = str.toCharArray();
        for (int i = 2; i < chars.length; i++) {
            if (chars[i] == chars[i - 1] && chars[i - 1] == chars[i - 2]) {
                length += 2; // length of repeating chars
            }
            if (chars[i] == chars[i - 1]) {
                ++length;
            }
        }
        return length;
    }
    public static void main(String[] args) {

        String input = "good";
        int n = input.length();
        char[] at = input.toCharArray();
        int length = 0;
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : at) {
            if (Character.isLowerCase(i))
                hasLower = true;
//            if (Character.isUpperCase(i))
//                hasUpper = true;
//            if (Character.isDigit(i))
//                hasDigit = true;
//            if (set.contains(i))
//                specialChar = true;
        }
        if (hasLower) {
            for (int i = 0; i < n; i++) {
                length += counts(input.substring(i, i + 1));
                length += length;
                if (length < n) {
                    length += counts(input.substring(i, i + 2));
                }
                if (i == 0) {
                    length += counts(input.substring(0, n - 1));
                    length += counts(input.substring(0));
                }
                if (i == 1) {
                    length += counts(input.substring(1, n));
                    length += counts(input.substring(1, i+2));
                }
                if (i == 2) {
                    length += counts(input.substring(2, n));
                }
            }
        }
        System.out.println("length " + length);
    }
}

