package Lv1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution01 {
    /**
     * K번째수
     *
     * @param array
     * @param commands
     * @return
     * class Solution {
     *     public int[] solution(int[] array, int[][] commands) {
     *         int n = 0;
     *         int[] ret = new int[commands.length];
     *
     *         while(n < commands.length){
     *             int m = commands[n][1] - commands[n][0] + 1;
     *
     *             if(m == 1){
     *                 ret[n] = array[commands[n++][0]-1];
     *                 continue;
     *             }
     *
     *             int[] a = new int[m];
     *             int j = 0;
     *             for(int i = commands[n][0]-1; i < commands[n][1]; i++)
     *                 a[j++] = array[i];
     *
     *             sort(a, 0, m-1);
     *
     *             ret[n] = a[commands[n++][2]-1];
     *         }
     *
     *         return ret;
     *     }
     *
     *     void sort(int[] a, int left, int right){
     *         int pl = left;
     *         int pr = right;
     *         int x = a[(pl+pr)/2];
     *
     *         do{
     *             while(a[pl] < x) pl++;
     *             while(a[pr] > x) pr--;
     *             if(pl <= pr){
     *                 int temp = a[pl];
     *                 a[pl] = a[pr];
     *                 a[pr] = temp;
     *                 pl++;
     *                 pr--;
     *             }
     *         }while(pl <= pr);
     *
     *         if(left < pr) sort(a, left, pr);
     *         if(right > pl) sort(a, pl, right);
     *     }
     * }
     */
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> arrayList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < commands.length; i++) {
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                arrayList.add(array[j]);
                list.add(array[j]);
            }
            arrayList.sort(Comparator.naturalOrder());
            answer[i] = arrayList.get(commands[i][2] - 1);
            arrayList.clear();
        }

        return answer;
    }

}
