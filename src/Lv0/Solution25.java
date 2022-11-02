package Lv0;

public class Solution25 {
    /**
     * 아이스 아메리카노
     *
     * @param money
     * @return
     */
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;

        return answer;
    }
}
