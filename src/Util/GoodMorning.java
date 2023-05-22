package Util;

import java.util.ArrayList;

public class GoodMorning {
    static int[] arr = {1,2,3,4};
    static boolean[] sel = new boolean[arr.length];
    static ArrayList<Integer> ret = new ArrayList<>();

    public static void main(String[] args) {
//        permutation(3);
//        multiPermutation(3);
//        combination(0, 3);
//        multiCombination(0,2);
        powerset(0);
    }
    //순열
    private static void permutation(int r) {
        if( r == 0){
            System.out.println(ret);
            return;
        }
        for(int i=0; i<arr.length; i++){
            if(sel[i]) continue;
            sel[i] = true;
            ret.add(arr[i]);
            permutation(r-1);
            ret.remove(ret.size()-1);
            sel[i] = false;
        }
    }

    //중복 순열
    private static void multiPermutation(int r) {
        if(r == 0){
            System.out.println(ret);
            return;
        }
        for(int i=0; i<arr.length; i++){
            ret.add(arr[i]);
            multiPermutation(r-1);
            ret.remove(ret.size()-1);
        }
    }

    //조합
    private static void combination(int idx, int r) {
        if(r == 0){
            System.out.println(ret);
            return;
        }
        for(int i=idx; i<arr.length; i++){
            ret.add(arr[i]);
            combination(i+1,r-1);
            ret.remove(ret.size()-1);
        }
    }

    //중복 조합
    private static void multiCombination(int idx, int r) {
        if(r == 0){
            System.out.println(ret);
            return;
        }
        for(int i=idx; i<arr.length; i++){
            ret.add(arr[i]);
            multiCombination(idx, r-1);
            ret.remove(ret.size()-1);
        }
    }

    private static void powerset(int r) {
        if( r == arr.length){
            System.out.println(ret);
            return;
        }
        ret.add(arr[r]);
        powerset(r+1);
        ret.remove(ret.size()-1);
        powerset(r+1);
    }

}
