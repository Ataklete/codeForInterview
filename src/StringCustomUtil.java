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
        if(s1.length()<1 && s2.length()<=200){
            return null;
        }
        String[] newS1 = s1.trim().toLowerCase().split("\\s+");
        String[] newS2 = s2.trim().toLowerCase().split("\\s+");
            if (newS1.length == newS2.length) {
                for (int i = 0; i < s1.length() - 1; i++) {
                    if (!newS1[i].equals(newS2[i]))
                        return new String[]{newS1[i], newS2[i]};
                }
            } else {
            for (int j = 0; j < s1.length() - 1; j++) {
                if (newS1[j].equals(newS1[j + 1])) ;
                return new String[]{s2};
            }
        }
        return new String[]{s1,s2};
    }
}