package Lv1;

public class Solution20 {
    /**
     * @param n
     * @return 수박수박수박수박수박수?
     * 문제 설명
     * 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
     * <p>
     * 제한 조건
     * n은 길이 10,000이하인 자연수입니다.
     *
     * 다른 풀이
     *
     * public String watermelon(int n){
     *
     *         return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
     *     }
     */
    public String solution(int n) {
        String answer = "";

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += "박";
            } else {
                answer += "수";
            }
        }
        return answer;
    }
}