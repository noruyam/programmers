package Lv0;

public class Solution18 {
    /**
     * 배열 뒤집기
     *
     * @param num_list
     * @return
     */
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int idx = num_list.length - 1;
        for (int a : num_list) {
            answer[idx] = a;
            idx--;
        }
        return answer;
    }
}
