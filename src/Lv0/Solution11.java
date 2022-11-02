package Lv0;

public class Solution11 {
    /**
     * 배열의 평균값
     *
     * @param numbers
     * @return
     */
    public double solution(int[] numbers) {
        double answer = 0;
        for (int num : numbers) {
            answer += num;
        }
        answer = answer / numbers.length;
        return answer;
    }
}
