package Lv0;

public class Solution44 {
    /**
     * 평행
     *
     * @param dots
     * @return
     */
    public int solution(int[][] dots) {
        int answer = 0;
        double result = 0;
        if (slope(dots[0], dots[1]) == slope(dots[2], dots[3])) {
            answer = 1;
        }
        if (slope(dots[0], dots[3]) == slope(dots[1], dots[2])) {
            answer = 1;
        }
        if (slope(dots[0], dots[2]) == slope(dots[1], dots[3])) {
            answer = 1;
        }


        return answer;
    }

    public double slope(int[] a, int[] b) {
        double q, w = 0;
        q = Math.abs(a[0] - b[0]);
        w = Math.abs(a[1] - b[1]);
        return q / w;
    }
}
