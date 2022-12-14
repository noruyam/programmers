package Lv1;

public class Solution16 {
    /**
     * @param s
     * @return 문자열 내 p와 y의 개수
     * 문제 설명
     * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
     * <p>
     * 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
     * <p>
     * 제한사항
     * 문자열 s의 길이 : 50 이하의 자연수
     * 문자열 s는 알파벳으로만 이루어져 있습니다.
     *
     * 다른 사람 풀이
     *
     * boolean solution(String s) {
     *         s = s.toLowerCase();
     *         int count = 0;
     *
     *         for (int i = 0; i < s.length(); i++) {
     *
     *             if (s.charAt(i) == 'p')
     *                 count++;
     *             else if (s.charAt(i) == 'y')
     *                 count--;
     *         }
     *
     *         if (count == 0)
     *             return true;
     *         else
     *             return false;
     *     }
     */
    public boolean solution(String s) {
        boolean answer = true;
        String b = s.toLowerCase();
        char[] a = b.toCharArray();
        int p = 0;
        int y = 0;

        for (char aa : a) {
            if ("p".equals(String.valueOf(aa))) {
                p++;
            } else if ("y".equals(String.valueOf(aa))) {
                y++;
            }
        }
        if (p == y) {
            return true;
        } else if (p == 0 && y == 0) {
            return true;
        } else {
            return false;
        }

    }
}