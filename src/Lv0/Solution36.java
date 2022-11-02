package Lv0;

public class Solution36 {
    /**
     * 세균 증식
     * @param n
     * @param t
     * @return
     */
    public int solution(int n, int t) {
        int answer = 0;
        for (int i = 1; i <= t; i++) {
            n *= 2;
        }
        answer = n;
        return answer;
    }
}
