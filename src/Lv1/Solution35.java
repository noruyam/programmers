package Lv1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution35 {
    /**
     * @param id_list
     * @param report
     * @param k
     * @return 신고 결과 받기
     * 문제 설명
     * 문제 설명
     * 신입사원 무지는 게시판 불량 이용자를 신고하고 처리 결과를 메일로 발송하는 시스템을 개발하려 합니다. 무지가 개발하려는 시스템은 다음과 같습니다.
     * <p>
     * 각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다.
     * 신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다.
     * 한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
     * k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
     * 유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.
     * 다음은 전체 유저 목록이 ["muzi", "frodo", "apeach", "neo"]이고, k = 2(즉, 2번 이상 신고당하면 이용 정지)인 경우의 예시입니다.
     *
     * 다른 풀이
     *   Map<String, List<String>> map = new HashMap<String, List<String>>();
     *
     *         Map<String, Integer> map1 = new HashMap<String, Integer>();
     *
     *         Map<String, Integer> map2 = new HashMap<String, Integer>();
     *
     *         int[] answer = new int[id_list.length];;
     *
     *         for (int j = 0; j < id_list.length; j++) {
     *
     *             map.put(id_list[j], new ArrayList<>());
     *             map1.put(id_list[j], 0);
     *             map2.put(id_list[j], 0);
     *
     *         }
     *
     *         List<String> wndqhrlist = new ArrayList<>(List.of(report));
     *
     *         Set<String> set = new HashSet<>(wndqhrlist);
     *
     *         List<String> result = new ArrayList<>(set);
     *
     *         for (int i = 0; i < result.size(); i++) {
     *             String[] a = result.get(i).split(" ");
     *             map.get(a[0]).add(a[1]);
     *             map1.put(a[1], map1.get(a[1]) + 1);
     *         }
     *
     *         for (int a = 0; a < id_list.length; a++) {
     *             List<String> list = map.get(id_list[a]);
     *
     *             for (String key : map1.keySet()) {
     *                 if (map1.get(key) >= k) {
     *                     for (int b = 0; b < list.size(); b++) {
     *                         if (key.equals(list.get(b))) {
     *                             map2.put(id_list[a], map2.get(id_list[a]) + 1);
     *                         }
     *                     }
     *                 }
     *             }
     *         }
     *
     *         for(int i=0; i<id_list.length; i++) {
     *             answer[i] = map2.get(id_list[i]);
     *         }
     *
     *
     *
     *         return answer;
     */
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, HashSet> map = new HashMap();

        for (String id_map : id_list) {
            map.put(id_map, new HashSet<>());
        }

        for (String report_list : report) {
            String[] re_list_split = report_list.split(" ");
            HashSet target_list = map.getOrDefault(re_list_split[0], new HashSet<>());

            target_list.add(re_list_split[1]);

            map.put(re_list_split[0], target_list);
        }

        HashMap stopCntMap = new HashMap();

        for (int j = 0; j < id_list.length; j++) {
            int stop = 0;
            for (int i = 0; i < map.size(); i++) {
                for (Object a : map.get(id_list[i])) {
                    if (a.equals(id_list[j])) {
                        stop++;
                    }
                }
            }
            stopCntMap.put(id_list[j], stop);
        }

        List blockNameList = new ArrayList();

        for (int i = 0; i < stopCntMap.size(); i++) {
            if ((int) stopCntMap.get(id_list[i]) >= k) {
                blockNameList.add(id_list[i]);
            }
        }

        HashMap<String, Integer> mailMap = new HashMap();

        for (Object aa : blockNameList) {
            for (int i = 0; i < map.size(); i++) {
                for (Object aaa : map.get(id_list[i])) {
                    if (aa.equals(aaa)) {
                        mailMap.put(id_list[i], mailMap.getOrDefault(id_list[i], 0) + 1);
                    }
                }
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailMap.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
}