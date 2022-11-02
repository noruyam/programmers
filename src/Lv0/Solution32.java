package Lv0;

public class Solution32 {
    /**
     * 옷가게 할인 받기
     *
     * @param price
     * @return
     */
    public int solution(int price) {
        int answer = 0;
        if (price >= 100000) {
            if (price < 300000) {
                answer = (int) (price * 0.95);
            } else if (price < 500000) {
                answer = (int) (price * 0.9);
            } else {
                answer = (int) (price * 0.8);
            }
        } else {
            answer = price;
        }
        return answer;
    }
}
