package Lv0;

public class Solution12 {
    /**
     * 두 수의 나눗셈
     *
     * @param num1
     * @param num2
     * @return
     */
    public int solution(int num1, int num2) {
        int answer = 0;
        double result = ((double) num1 / (double) num2);
        answer = (int) (result * 1000);
        return answer;
    }
}
