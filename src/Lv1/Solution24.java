package Lv1;

public class Solution24 {
    /**
     * @param n
     * @return 자연수 뒤집어 배열로 만들기
     * 문제 설명
     * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
     * <p>
     * 제한 조건
     * n은 10,000,000,000이하인 자연수입니다.
     *
     * 다른 풀이
     * 1.
     * public int[] solution(long n) {
     *       String a = "" + n;
     *         int[] answer = new int[a.length()];
     *         int cnt=0;
     *
     *         while(n>0) {
     *             answer[cnt]=(int)(n%10);
     *             n/=10;
     *             System.out.println(n);
     *             cnt++;
     *         }
     *       return answer;
     *   }
     *
     *  2.
     *   public int[] solution(long n) {
     *         return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
     *     }
     */
    public int[] solution(long n) {

        String s = String.valueOf(n);
        int len = s.length();
        int[] answer = new int[len];
        int cnt = 0;

        for (int i = s.length(); i > 0; i--) {
            if (i == 0) {
                break;
            }
            answer[cnt] = Integer.parseInt(s.substring(i - 1, i));
            cnt++;
        }
        return answer;
    }
}