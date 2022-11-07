import Lv0.Solution42;
import Lv1.Solution01;

public class Main {
    public static void main(String[] args) {

        Solution01 solution40 = new Solution01();
        int[] a = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] b = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(solution40.solution(new int[]{1, 5, 2, 6, 3, 7, 4},b));
    }

}