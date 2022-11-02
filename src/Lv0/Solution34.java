package Lv0;

public class Solution34 {
    /**
     * 배열의 유사도
     *
     * @param s1
     * @param s2
     * @return
     */
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String ss : s1) {
            for (int i = 0; i < s2.length; i++) {
                if (ss.equals(s2[i])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
