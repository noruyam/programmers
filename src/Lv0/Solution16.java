package Lv0;

public class Solution16 {
    /**
     * 피자 나눠 먹기 (1)
     *
     * @param n
     * @return
     */
    public int solution(int n) {
        int answer = 0;
        answer = (int) Math.ceil((double) n / (double) 7);
        return answer;
    }
}
