package Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution03 {
    /**
     * 모의고사
     *
     * @param answers
     * @return
     */
    public int[] solution(int[] answers) {

        int[] arr = new int[3];
        int[] first = new int[]{1, 2, 3, 4, 5};
        int[] second = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int cnt = 0;
        int idx = 0;
        int alen = answers.length;
        int[] a;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                a = first;
            } else if (i == 1) {
                a = second;
            } else {
                a = third;
            }
            for (int j = 0; j < alen; j++) {
                if (answers[j] == a[idx]) {
                    cnt++;
                }
                idx++;
                if (idx == a.length) {
                    idx = 0;
                }
            }
            arr[i] = cnt;
            idx = 0;
            cnt = 0;
        }
        int iMax = 0;
        for (int aa : arr) {
            iMax = Math.max(aa, iMax);
        }
        int cc = 0;
        for (int b : arr) {
            if (b == iMax) {
                cc++;
            }
        }
        int[] answer = new int[cc];
        int bb = 1;
        for (int b : arr) {
            if (b == iMax) {
                answer[bb - 1] = bb;
                bb++;
            }
        }
        Arrays.sort(answer);
        for (int bbb: answer
             ) {
            System.out.println(bbb);
        }
        return answer;
    }
}
