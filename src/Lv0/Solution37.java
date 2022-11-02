package Lv0;

public class Solution37 {
    /**
     * 문자 반복 출력하기
     *
     * @param my_string
     * @param n
     * @return
     */
    public String solution(String my_string, int n) {
        String answer = "";
        String test = "";
        int a = 1;
        for (int i = 0; i < my_string.length(); i++) {
            test = my_string.substring(i, a);
            for (int j = 0; j < n; j++) {
                answer += test;
            }
            a++;
        }
        return answer;
    }
}
