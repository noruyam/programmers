package Lv0;

public class Solution43 {
    /**
     * 옹알이 (1)
     *
     * @param babbling
     * @return
     * 다른 사람 풀이 ->
     *          int answer = 0;
     *          for(int i=0; i<babbling.length; i++){
     *             if(babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")){
     *                 answer++;
     *             }
     *          }
     *          return answer;
     *         
     */
    public int solution(String[] babbling) {
        int answer = 0;
        String a = "aya", b = "ye", c = "woo", d = "ma";
        String[] arr = new String[]{a, b, c, d};
        String result = "";
        for (String bab : babbling) {
            result = bab;
            for (String arrays : arr) {
                result = result.replace(arrays, " ");
            }
            if (result.strip().length() == 0) {
                answer += 1;
            }
        }
        return answer;
    }
}
