package Lv0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution42 {
    /**
     * 최빈값 구하기
     * @param array
     * @return
     */
    public int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap();

        for (int i : array) {

            if (null != map.get(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i,1);
            }
            System.out.println(map.get(i));
        }


        return answer;
    }
}
