package Lv0;

public class Solution22 {
    /**
     * 배열 두배 만들기
     *
     * @param numbers
     * @return
     */
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        int num = 0;
        for (int a : numbers) {
            answer[num] = a * 2;
            num++;
        }
        return answer;
    }
}
