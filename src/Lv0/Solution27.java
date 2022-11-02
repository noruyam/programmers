package Lv0;

import java.util.Arrays;

public class Solution27 {
    /**
     * 최댓값 만들기 (1)
     * @param numbers
     * @return
     */
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = numbers[numbers.length-1] * numbers[numbers.length - 2];
        return answer;
    }
}
