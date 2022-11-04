import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;

public class BalanceSymbol {
    public static boolean checkSymbolBalance(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] charArray = s.toCharArray();
        for (Character ch : charArray) {
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
                continue;
            }
            else if (stack.isEmpty())
                return false;
                char check;
                switch (ch) {
                    case ')':
                        check = stack.pop();
                        if (check == '{' || check == '[')
                            return false;
                        break;

                    case '}':
                        check = stack.pop();
                        if (check == '(' || check == '[')
                            return false;
                        break;

                    case ']':
                        check = stack.pop();
                        if (check == '(' || check == '{')
                            return false;
                        break;
                }
        }
        return true;
    }
    public static boolean checkSymbolBalanceUsingHashMap(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        HashMap<Character, Character> pair = new HashMap();
        pair.put(']', '[');
        pair.put('}', '{');
        pair.put(')', '(');
        char[] charArray = s.toCharArray();
        for (Character ch : charArray) {
            if (Character.isDigit(ch) || Character.isLetter(ch))
                return false;
            else if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
                continue;
            }
                else if (ch == '}' || ch == ')' || ch == ']') {
                    if(!stack.isEmpty()){
                    if (pair.get(ch) == stack.pop()) {
                        continue;
                     }
                    else return false;
                    }
                }
        }
        if (stack.isEmpty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "[({})]{}";
        if (s.isEmpty())
            System.out.println("String is empty ");
        else {
            if (checkSymbolBalanceUsingHashMap(s)) {
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }
        }
    }
}
