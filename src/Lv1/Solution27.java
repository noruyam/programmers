package Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution27 {
    /**
     * @param arr
     * @return 제일 작은 수 제거하기
     * 문제 설명
     * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
     * <p>
     * 제한 조건
     * arr은 길이 1 이상인 배열입니다.
     * 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
     * <p>
     * 다른 풀이
     * <p>
     * public int[] solution(int[] arr) {
     * if (arr.length <= 1) return new int[]{ -1 };
     * int min = Arrays.stream(arr).min().getAsInt();
     * return Arrays.stream(arr).filter(i -> i != min).toArray();
     * }
     */
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int[] answer = new int[arr.length - 1];
        int cnt = 0;

        ArrayList al = new ArrayList();

        for (int c : arr) {
            al.add(c);
        }
        al.sort(Comparator.reverseOrder());
        int re = (int) al.get(arr.length - 1);

        System.out.println("re = " + re);
        for (int b : arr) {
            if (cnt == arr.length - 1) {
                break;
            }
            System.out.println("b = " + b);
            if (re != b) {
                answer[cnt] = b;
                cnt++;
            }
        }
        System.out.println("answer = " + answer.length);

        return answer;
    }
}