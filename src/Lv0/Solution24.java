package Lv0;

public class Solution24 {
    /**
     * 짝수는 싫어요
     *
     * @param n
     * @return
     */
    public int[] solution(int n) {
        int[] answer = {};
        if (n % 2 == 0) {
            answer = new int[n / 2];
        } else {
            answer = new int[n / 2 + 1];
        }
        int idx = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                answer[idx] = i;
                idx++;
            }
        }
        return answer;
    }
}
