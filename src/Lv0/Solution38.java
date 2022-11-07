package Lv0;

public class Solution38 {
    /**
     * 분수의 덧셈
     *
     * @param denum1
     * @param num1
     * @param denum2
     * @param num2
     * @return
     */
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int test = 0;
        if (num1 > num2) {
            test = num1 % num2;
        } else if (num1 < num2) {
            test = num2 % num1;
        } else if (num1 == num2) {

        }

        if (test == 0) {
            if (num1 < num2) {
                answer[0] = denum1 * (num2 / num1);
                answer[1] = num2;
            } else {

            }
        }
        return answer;
    }
}
