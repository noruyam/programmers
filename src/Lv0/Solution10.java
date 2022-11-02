package Lv0;

public class Solution10 {
    /**
     * 양꼬치
     *
     * @param n
     * @param k
     * @return
     */
    public int solution(int n, int k) {
        int answer = 0;
        answer = (n * 12000) + (k * 2000) - ((n / 10) * 2000);
        return answer;
    }
}
