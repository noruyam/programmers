package Lv0;

import java.util.Arrays;
import java.util.Stack;

public class Solution41 {
    /**
     * 중앙값 구하기
     * @param array
     * @return
     */
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        answer = array[array.length / 2];
        return answer;
    }
}
