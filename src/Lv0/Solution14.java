package Lv0;

import java.util.Collections;

public class Solution14 {
    /**
     * 머쓱이보다 키 큰 사람
     *
     * @param array
     * @param height
     * @return
     */
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int idx : array) {
            if (idx > height) {
                answer++;
            }
        }
        return answer;
    }
}
