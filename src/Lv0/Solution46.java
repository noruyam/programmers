package Lv0;

public class Solution46 {
    /**
     * 연속된 수의 합
     *
     * @param num
     * @param total
     * @return
     */
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        if (num == 1) {
            answer[0] = total;
            return answer;
        }

        if (total == 0) {
            int test1 = 0;

            int c = Math.abs(num / -2);
            for (int i = num / -2; i <= c; i++) {

                answer[test1] = i;
                test1++;
            }
            return answer;
        }
        int a = 0;
        int cnt = 0;
        for (int i = -100; i < total - 2; i++) {
            a = i * num + test(num);
            cnt = i;
            if (a == total) {
                System.out.println(a);
                for (int j = 0; j < num; j++) {
                    answer[j] = cnt;
                    cnt++;
                }
                break;
            }
        }
        return answer;
    }

    public int test(int num) {
        int aa = 0;
        for (int i = 1; i < num; i++) {
            aa += i;
        }
        return aa;
    }
}
