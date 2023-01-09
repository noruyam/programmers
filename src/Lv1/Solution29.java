package Lv1;

public class Solution29 {
    /**
     * @param x
     * @return 하샤드 수
     * 문제 설명
     * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
     * <p>
     * 제한 조건
     * x는 1 이상, 10000 이하인 정수입니다.
     */
    public boolean solution(int x) {
        boolean answer = true;
        int b = 0;
        int num = 10000;

        int re = x;
        for (int i = 0; i < 5; i++) {

            System.out.println("x = " + x);
            System.out.println("num = " + num);
            b += x / num;
            System.out.println("b = " + b);
            x %= num;
            num /= 10;
            System.out.println(" =================== ");
            if (num == 1) {
                b += x % 10;
                break;
            }
        }
        System.out.println("b = " + b);
        return x / b == 0 ? true : false;
    }
}