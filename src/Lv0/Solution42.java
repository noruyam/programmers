package Lv0;

import java.util.*;
import java.util.Map.Entry;

public class Solution42 {
    /**
     * 최빈값 구하기
     *
     * @param array
     * @return
     * Map<Integer, Integer> map = new LinkedHashMap<>();
     *
     *         for (int num : array) {
     *             map.put(num, map.getOrDefault(num, 0) + 1);
     *         }
     *
     *         List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
     *         entries.sort((o1, o2) -> o2.getValue() - o1.getValue());
     *
     *         if (entries.size() > 1) {
     *             if (entries.get(0).getValue() == entries.get(1).getValue()) return -1;
     *         }
     *
     *         return entries.get(0).getKey();
     */
    public int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap();
        Map<Integer, Integer> testMap = new TreeMap<>();
        for (int i : array) {
            if (null != map.get(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        List<Entry<Integer, Integer>> arrayList = new ArrayList<Entry<Integer, Integer>>(map.entrySet());


        Collections.sort(arrayList, new Comparator<Entry<Integer, Integer>>() {
            // compare로 값을 비교
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2)
            {
                // 내림 차순으로 정렬
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        int idx=0;
        int test=0;
        for(Entry<Integer, Integer> entry : arrayList) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            if (idx == 0) {
                test = entry.getValue();
                answer = entry.getKey();
            } else {
                if (test == entry.getValue()) {
                    return -1;
                } else {
                    return answer;
                }
            }
            idx++;
        }
        return answer;

    }
}
