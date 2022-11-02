package Lv0;

public class Solution30 {
    /**
     * 문자열안에 문자열
     *
     * @param str1
     * @param str2
     * @return
     */
    public int solution(String str1, String str2) {
        int answer = 1;
        int before = str1.length();
        int after = 0;

        after = str1.replace(str2, "").length();
        if (before == after) {
            answer = 2;
        }

        return answer;
    }
}
