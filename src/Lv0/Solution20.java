package Lv0;

public class Solution20 {
    /**
     * 배열 원소의 길이
     *
     * @param strlist
     * @return
     */
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int idx = 0;
        for (String a : strlist) {
            answer[idx] = a.length();
            idx++;
        }
        return answer;
    }
}
