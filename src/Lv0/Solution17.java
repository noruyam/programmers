package Lv0;

public class Solution17 {
    /**
     * 짝수 홀수 개수
     *
     * @param num_list
     * @return
     */
    public int[] solution(int[] num_list) {

        int jjak = 0;
        int hol = 0;
        for (int t : num_list) {
            if (t % 2 == 0) {
                jjak++;
            } else {
                hol++;
            }
        }
        int[] answer = {jjak, hol};
        return answer;
    }
}
