package Lv0;

public class Solution23 {
    /**
     * 점의 위치 구하기
     *
     * @param dot
     * @return
     */
    public int solution(int[] dot) {
        int answer = 0;
        if (dot[0] < 0) {
            if (dot[1] < 0) {
                answer = 3;
            } else {
                answer = 2;
            }
        } else {
            if (dot[1] < 0) {
                answer = 4;
            } else {
                answer = 1;
            }
        }
        return answer;
    }
}
