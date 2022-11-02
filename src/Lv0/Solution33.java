package Lv0;

public class Solution33 {
    /**
     * 제곱수 판별하기
     *
     * @param n
     * @return
     */
    public int solution(int n) {
        int answer = 0;
        int idx = 1;
        while (true) {

            if (idx * idx == n) {
                answer = 1;
                break;
            } else {
                answer = 2;
            }

            if (idx == 1000) {
                break;
            }
            idx++;
        }
        return answer;
    }
}
