package Lv1;

import java.util.ArrayList;
import java.util.Comparator;

public class Solution17 {
    /**
     * @param s
     * @return 문자열 내림차순으로 배치하기
     * 문제 설명
     * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
     * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
     * <p>
     * 제한 사항
     * str은 길이 1 이상인 문자열입니다.
     *
     * 다른 풀이
     *
     * char[] sol = str.toCharArray();
     *     Arrays.sort(sol);
     *     return new StringBuilder(new String(sol)).reverse().toString();
     */
    public String solution(String s) {
        String answer = "";
        char[] a = s.toCharArray();

        ArrayList<String> c = new ArrayList<>();

        for (char b : a) {
            c.add(String.valueOf(b));
        }

        c.sort(Comparator.reverseOrder());
        for (String d : c) {
            answer += d;
        }

        return answer;
    }
}