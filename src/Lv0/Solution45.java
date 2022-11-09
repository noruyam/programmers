package Lv0;

public class Solution45 {
    /**
     * 다음에 올 숫자
     *
     * @param common
     * @return
     */
    public int solution(int[] common) {
        int answer = 0;
        System.out.println(cOrb(common));
        if ("c".equals(cOrb(common).substring(0, 1))) {
            answer = common[common.length - 1] + Integer.parseInt(cOrb(common).substring(2));
        } else if ("b".equals(cOrb(common).substring(0, 1))) {
            answer = common[common.length - 1] * Integer.parseInt(cOrb(common).substring(2));
        }
        return answer;
    }

    public String cOrb(int[] a) {
        String result = "";
        if (a[1] - a[0] == a[2] - a[1]) {
            result = "c " + (a[1] - a[0]);
        } else if (a[1] / a[0] == a[2] / a[1]) {
            result = "b " + (a[1] / a[0]);
        }
        return result;
    }
}
