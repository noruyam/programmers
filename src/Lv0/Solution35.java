package Lv0;

public class Solution35 {
    /**
     * 자릿수 더하기
     * @param n
     * @return
     */
    public int solution(int n) {
        int answer = 0;
        while(n > 0) {
            answer += n%10;
            n /= 10;
        }
        return answer;
    }
}
