package Lv2;

public class Solution5 {

    public static void main(String[] args) {
        solution(2, 4);
    }

    /**
     * @param k
     * @param d
     * @return 점 찍기
     * 문제 설명
     * 좌표평면을 좋아하는 진수는 x축과 y축이 직교하는 2차원 좌표평면에 점을 찍으면서 놀고 있습니다. 진수는 두 양의 정수 k, d가 주어질 때 다음과 같이 점을 찍으려 합니다.
     * <p>
     * 원점(0, 0)으로부터 x축 방향으로 a*k(a = 0, 1, 2, 3 ...), y축 방향으로 b*k(b = 0, 1, 2, 3 ...)만큼 떨어진 위치에 점을 찍습니다.
     * 원점과 거리가 d를 넘는 위치에는 점을 찍지 않습니다.
     * 예를 들어, k가 2, d가 4인 경우에는 (0, 0), (0, 2), (0, 4), (2, 0), (2, 2), (4, 0) 위치에 점을 찍어 총 6개의 점을 찍습니다.
     * <p>
     * 정수 k와 원점과의 거리를 나타내는 정수 d가 주어졌을 때, 점이 총 몇 개 찍히는지 return 하는 solution 함수를 완성하세요.
     *
     * 다른 풀이
     * public static long solution(int k, int d) {
     *         long answer = 0;
     *
     *         // x 좌표를 k 배수만큼 증가
     *         for(int i=0; i<=d; i+=k){
     *             int yMaxDistance = yPossibleDistance(i, d);
     *             answer += yPossibleCount(yMaxDistance, k);
     *         }
     *         return answer;
     *     }
     *
     *
     *     // 피타고라스 정리
     *     // y² = d² - x²
     *
     *     private static int yPossibleDistance(int x, int d){
     *         long xx = (long) Math.pow(x, 2);
     *         long dd = (long) Math.pow(d, 2);
     *
     *         int result = (int)(Math.sqrt(dd-xx));
     *         return result;
     *     }
     *
     *     // '0'~'y 최대치 정수'에서, k 배수의 숫자가 몇 개 있는지 확인
     *     private static int yPossibleCount(int possible, int k){
     *         int y = (possible/k);
     *         return y+1;
     *     }
     */
    public static long solution(int k, int d) {
        long answer = 0;

        for (int i = 0; i * k <= d; i++) {
            for (int j = 0; j * k < i * k; j++) {
                if (rms(i * k, j * k) > d) {
                    break;
                } else {
                    answer += 2;
                }
            }
        }
        System.out.println("answer = " + answer);
        return answer;
    }

    public static double rms(int a, int b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

}