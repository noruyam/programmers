package Lv0;

public class Solution13 {
    /**
     * 중복된 숫자 개수
     *
     * @param array
     * @param n
     * @return
     */
    public int solution(int[] array, int n) {
        int answer = 0;
        int idx = 0;
        for (int t : array) {
            if (t == n) {
                idx++;
            }
        }
        answer = idx;
        return answer;
    }
}
