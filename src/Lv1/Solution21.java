package Lv1;

public class Solution21 {
    /**
     * @param s
     * @return 문자열을 정수로 바꾸기
     * 문제 설명
     * 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
     * <p>
     * 제한 조건
     * s의 길이는 1 이상 5이하입니다.
     * s의 맨앞에는 부호(+, -)가 올 수 있습니다.
     * s는 부호와 숫자로만 이루어져있습니다.
     * s는 "0"으로 시작하지 않습니다.
     *
     * 다른 풀이
     *
     * public int solution(String s) {
     *
     *          return Integer.parseInt(s);
     *     }
     */
    public int solution(String s) {
        int answer = 0;
        int num = 0;
        if (s.substring(0, 1) == "+" || s.substring(0, 1) == "-") {
            num = 1;
        }

        answer = Integer.parseInt(s.substring(num));

        if (s.substring(0, 1) == "-") {
            answer = answer * -1;
        }

        return answer;
    }
}