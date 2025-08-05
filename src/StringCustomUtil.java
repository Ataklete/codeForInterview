import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* A sentence is a string of single-space separated words where each word consists only of lowercase letters.

A word is uncommon if it appears exactly once in both sentences.

Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.



Testcase 1:
Input: s1= "good", s2 = "start"
Output: ["good", "start"]

Testcase 2:
Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]

Testcase 3:
Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]


Constraints:

1 <= s1.length, s2.length <= 200
s1 and s2 consist of lowercase English letters and spaces.
s1 and s2 do not have leading or trailing spaces.
All the words in s1 and s2 are separated by a single space.

*/
public class StringCustomUtil {
    public static String[] testString(String s1, String s2) {
        if (s1.length() < 1 && s2.length() <= 200) {
            return null;
        }
        String[] newS1 = s1.trim().toLowerCase().split("\\s+");
        String[] newS2 = s2.trim().toLowerCase().split("\\s+");
        System.out.println(Arrays.stream(s1.split("")).collect(Collectors.joining(",")));;
        List<String> list = new ArrayList<>();
        int count = 0;
            for (int i = 0; i < newS1.length; i++) {
                if (!list.contains(newS1[i])) {
                    list.add(newS1[i]);
                } else {
                   list.remove(newS1[i]);
                }
            }
            for (int i = 0; i < newS2.length; i++) {
                if (!list.contains(newS2[i])) {
                    list.add(newS2[i]);
                } else {
                    list.remove(newS2[i]);
                }
            }

            String[] result = list.toArray(String[]::new);
            return result;
    }

    public static void main(String[] args) {
        Arrays.stream(testString("ati ati helen henok", "saba saba")).forEach(x -> System.out.println(x));
    }
}