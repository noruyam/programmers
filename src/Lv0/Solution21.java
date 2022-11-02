package Lv0;

public class Solution21 {
    /**
     * 문자열 뒤집기
     *
     * @param my_string
     * @return
     */
    public String solution(String my_string) {
        String answer = "";
        for (int i = my_string.length(); i > 0; i--) {
            answer += my_string.substring(i - 1, i);
        }
        return answer;
    }
}
