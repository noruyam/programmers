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
        boolean chk = true;
        stack.push(arr[0]);
        queue.offer(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                stack.push(arr[i]);
                queue.offer(arr[i]);
            }
        }
        int idx = 0;
        int[] answer = new int[stack.size()];
        for (int a : stack) {
            answer[idx] = a;
            idx++;
        }
        return answer;
    }
}
