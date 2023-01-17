package Lv2;

import java.util.LinkedList;
import java.util.Queue;

public class Solution7 {

    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 2, 3});
    }

    /**
     * @param prices
     * @return 주식가격
     * 문제 설명
     * 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
     *
     * 다른 풀이
     * public int[] solution(int[] prices) {
     *         int len = prices.length;
     *         int[] answer = new int[len];
     *         int i, j;
     *         for (i = 0; i < len; i++) {
     *             for (j = i + 1; j < len; j++) {
     *                 answer[i]++;
     *                 if (prices[i] > prices[j])
     *                     break;
     *             }
     *         }
     *         return answer;
     *     }
     */
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int second = 0;
        int a = 0;
        Queue<Integer> q1 = new LinkedList();

        for (int p : prices) {
            q1.add(p);
        }

        for (int j = 0; j < prices.length; j++) {
            a = q1.poll();
            for (int i = j + 1; i < prices.length; i++) {
                if (a <= prices[i]) {
                    second++;
                    answer[j] = second;
                } else {
                    second++;
                    answer[j] = second;
                    break;
                }
            }
            second = 0;
        }

        return answer;
    }

}