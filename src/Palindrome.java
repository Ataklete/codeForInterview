public class Palindrome {

    public static boolean palindrom(String s) {
        char[] c = s.replace(" ","").toCharArray();
        boolean isPalindrom = false;
        for (int i = 0; i < c.length - 1; i++) {
            int j = (c.length - 1) - i;
            if (i < j) {
                if (Character.toLowerCase(c[i]) == Character.toLowerCase(c[j])) {
                    isPalindrom = true;
                }else {
                    isPalindrom = false;
                    break;
                }
            }
        }
        return isPalindrom;
    }
    public static boolean palindrom2(String s) {
        s = s.replace(" ","");
        for (int i = 0; i < s.length() - 1; i++) {
            int j = (s.length() - 1) - i;
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                    return false;
                }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(palindrom("abcdcba"));
        System.out.println(palindrom("ataklete"));
        System.out.println(palindrom2("Racecar"));
        System.out.println(palindrom2("abcdcbaf"));
        System.out.println(palindrom2("Borrow or Rob"));
    }
}
