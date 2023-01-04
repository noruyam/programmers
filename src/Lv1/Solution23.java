package Lv1;

public class Solution23 {
    /**
     * @param s
     * @return 이상한 문자 만들기
     * 문제 설명
     * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
     * <p>
     * 제한 사항
     * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
     * 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
     *
     * 다른 풀이
     *
     *  public String solution(String s) {
     *
     *         String answer = "";
     *         int cnt = 0;
     *         String[] array = s.split("");
     *
     *         for(String ss : array) {
     *             cnt = ss.contains(" ") ? 0 : cnt + 1;
     *             answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
     *         }
     *       return answer;
     *   }
     */
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] a = s.split("");

//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length(); j++) {
//                if (j % 2 == 0) {
//                    answer += a[i].substring(j, j + 1).toUpperCase();
//                } else if (j % 2 == 1) {
//                    answer += a[i].substring(j, j + 1).toLowerCase();
//                }
//            }
//            if (i == a.length-1) {
//                break;
//            }
//            answer += " ";
//        }

        for (int i = 0; i < a.length; i++) {

            if (" ".equals(a[i])) {
                cnt = 0;
                answer += " ";
            } else if (cnt % 2 == 0) {
                cnt++;
                answer += a[i].toUpperCase();
            } else if (cnt % 2 == 1) {
                cnt++;
                answer += a[i].toLowerCase();
            }
        }
        return answer;
    }
}