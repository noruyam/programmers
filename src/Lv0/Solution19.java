package Lv0;

public class Solution19 {
    /**
     * 피자 나눠 먹기 (3)
     *
     * @param slice
     * @param n
     * @return
     */
    public int solution(int slice, int n) {
        int answer = 0;
        double test = 0;
        test = (double) slice / (double) n;

        if (test < 1) {
            answer = (int) Math.ceil(1 / test);
        } else {
            answer = 1;
        }

        return answer;
    }
}
