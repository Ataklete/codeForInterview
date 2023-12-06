import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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
    public String[] testString(String s1, String s2) {
        if (s1.length() < 1 && s2.length() <= 200) {
            return null;
        }
        String[] newS1 = s1.trim().toLowerCase().split("\\s+");
        String[] newS2 = s2.trim().toLowerCase().split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        int count = 0;
        if (newS1.length != 1) {
            for (int i = 0; i < newS1.length; i++) {
                if (!map.containsKey(newS1[i])) {
                    map.put(newS1[i], 1);
                } else {
                    int a = map.get(newS1[i]);
                    map.put(newS1[i], a + 1);
                }
            }
            for (int i = 0; i < newS2.length; i++) {
                if (!map.containsKey(newS2[i])) {
                    map.put(newS2[i], 1);
                } else {
                    int a = map.get(newS2[i]);
                    map.put(newS2[i], a + 1);
                }
            }

            for (Map.Entry<String, Integer> a : map.entrySet()) {
                if (a.getValue() == 1) {
                    list.add(a.getKey());
                }
            }
            String[] result = new String[list.size()];
            for (String s : list){
                result[count++] = s;
            }
            return result;
        }
        return new String[]{newS1[0],newS2[0]};
    }
}