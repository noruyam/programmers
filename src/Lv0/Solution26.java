package Lv0;

import java.util.Arrays;

public class Solution26 {
    /**
     * 삼각형의 완성조건 (1)
     *
     * @param sides
     * @return
     */
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        if (sides[2] < sides[0] + sides[1]) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }
}
