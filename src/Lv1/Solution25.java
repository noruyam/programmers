package Lv1;

import java.util.ArrayList;
import java.util.Comparator;

public class Solution25 {
    /**
     * @param n
     * @return 정수 내림차순으로 배치하기
     * 문제 설명
     * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
     * <p>
     * 제한 조건
     * n은 1이상 8000000000 이하인 자연수입니다.
     *
     * 다른 풀이
     * 1.
     * public long solution(long n) {
     *         String[] list = String.valueOf(n).split("");
     *         Arrays.sort(list);
     *
     *         StringBuilder sb = new StringBuilder();
     *         for (String aList : list) sb.append(aList);
     *
     *         return Long.parseLong(sb.reverse().toString());
     *   }
     *
     *
     *   2.
     *   public class ReverseInt {
     *     String res = "";
     *     public int reverseInt(int n){
     *         res = "";
     *         Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
     *         return Integer.parseInt(res);
     *     }
     *
     *     // 아래는 테스트로 출력해 보기 위한 코드입니다.
     *     public static void  main(String[] args){
     *         ReverseInt ri = new ReverseInt();
     *         System.out.println(ri.reverseInt(118372));
     *     }
     * }
     */
    public long solution(long n) {
        long answer = 0;
        ArrayList arr1 = new ArrayList();
        String a = String.valueOf(n);
        char[] b = a.toCharArray();
        StringBuilder ss = new StringBuilder();

        for (char c : b) {
            arr1.add(c);
        }
        arr1.sort(Comparator.reverseOrder());
        for (Object c : arr1) {
            ss.append(c);
        }
        answer = Long.parseLong(ss.toString());
        return answer;
    }
}