package Lv1;

import java.util.*;

public class Solution43 {
    static int[] arr = {-2, 3, 0, 2, -5};
    static boolean[] sel = new boolean[arr.length];
    static ArrayList<Integer> ret = new ArrayList<>();
    static int cnt;

    public static void main(String[] args) {

        solution(new int[]{-2, 3, 0, 2, -5});
        System.out.println("========================");
        cnt = 0;
        arr = new int[]{-3, -2, -1, 0, 1, 2, 3};
        solution(new int[]{-3, -2, -1, 0, 1, 2, 3});
    }

    /**
     *
     * @param number
     * @return 삼총사
     * 문제 설명
     * 한국중학교에 다니는 학생들은 각자 정수 번호를 갖고 있습니다. 이 학교 학생 3명의 정수 번호를 더했을 때 0이 되면 3명의 학생은 삼총사라고 합니다. 예를 들어, 5명의 학생이 있고, 각각의 정수 번호가 순서대로 -2, 3, 0, 2, -5일 때, 첫 번째, 세 번째, 네 번째 학생의 정수 번호를 더하면 0이므로 세 학생은 삼총사입니다. 또한, 두 번째, 네 번째, 다섯 번째 학생의 정수 번호를 더해도 0이므로 세 학생도 삼총사입니다. 따라서 이 경우 한국중학교에서는 두 가지 방법으로 삼총사를 만들 수 있습니다.
     *
     * 한국중학교 학생들의 번호를 나타내는 정수 배열 number가 매개변수로 주어질 때, 학생들 중 삼총사를 만들 수 있는 방법의 수를 return 하도록 solution 함수를 완성하세요.
     *
     * 다른 풀이
     * int answer = 0;
     *
     *         for(int i=0; i<number.length-2; i++){
     *             for(int j=i+1; j<number.length-1; j++){
     *                 for(int k=j+1; k<number.length; k++){
     *                     if(number[i]+number[j]+number[k]==0) answer++;
     *                 }
     *             }
     *         }
     *
     *         return answer;
     */
    public static int solution(int[] number) {
        int answer = 0;
        combination(0, 3);
        return cnt;
    }

    private static void combination(int idx, int r) {
        if (r == 0) {
            System.out.println(ret);
            int a = 0;
            for (int c : ret) {
                a += c;
            }
            System.out.println("a = " + a);
            if (a == 0) {
                cnt++;
            }
            System.out.println("cnt = " + cnt);
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            ret.add(arr[i]);
            combination(i + 1, r - 1);
            ret.remove(ret.size() - 1);
        }
    }

}