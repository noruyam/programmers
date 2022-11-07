package Lv0;

import java.util.Stack;

public class Solution40 {
    /**
     * 올바른 괄호
     *
     * @param s
     * @return
     */
    public boolean solution(String s) {
        boolean answer = true;
        if (s.substring(0, 1).equals(")")) {
            return false;
        }

        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        int idx=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals("(")) {
                stack1.push("(");
                idx++;
            } else {
                stack2.push(")");
                idx--;
            }
            if (idx < 0) {
                return false;
            }
        }
        if (stack1.size() != stack2.size()) {
            answer = false;
        }

        return answer;
    }
}
