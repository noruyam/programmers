package Lv0;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution39 {
    /**
     * 같은 숫자는 싫어
     *
     * @param arr
     * @return
     */
    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        stack.push(arr[0]);
        queue.add(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            if (stack.search(arr[i]) > 0) {
            } else {
                stack.push(arr[i]);
                System.out.println(stack.peek());
            }
        }
        int idx = 0;
        int[] answer = new int[stack.size()];
        for (int a : stack) {
            answer[idx]=a;
            idx++;
            System.out.println(a);
        }
        return answer;

    }
}
