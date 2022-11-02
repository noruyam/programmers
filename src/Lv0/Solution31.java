package Lv0;

public class Solution31 {
    /**
     * 배열 자르기
     *
     * @param numbers
     * @param num1
     * @param num2
     * @return
     */
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int idx = 0;
        for (int i = num1; i <= numbers.length; i++) {

            answer[idx] = numbers[i];
            idx++;
            if (i >= num2) {
                break;
            }
        }
        return answer;
    }
}
