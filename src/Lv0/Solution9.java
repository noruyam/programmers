package Lv0;

public class Solution9 {
    /**
     * 짝수의 합
     *
     * @param n
     * @return
     */
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            answer += i % 2 == 0 ? i : 0;
        }
        return answer;
    }
}
