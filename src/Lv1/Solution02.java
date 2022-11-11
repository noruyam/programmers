package Lv1;

import java.util.*;

public class Solution02 {
    /**
     * 성격 유형 검사하기
     *
     * @param survey
     * @param choices
     * @return
     */
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        String test = ChoiceScore(3).substring(0, 1);
        if ("d".equals(test)) {
            System.out.println(test);
        } else if ("a".equals(test)) {
            System.out.println(test);
        } else {
            System.out.println(test);
        }
        return answer;
    }

    public String PersonalityType(String a, String ty) {
        String result = "";
        String first = ty.substring(0, 1);
        String second = ty.substring(1);

        if ("d".equals(a)) {
            result = ty.substring(0, 1);
        } else if ("a".equals(a)) {
            result = ty.substring(1);
        } else {

        }


        return result;
    }

    public String ChoiceScore(int choice) {
        String result = "";
        for (int i = 1; i <= 7; i++) {
            if (i == choice) {
                if (i < 4) {
                    result += "d" + test1(choice);
                } else if (i > 4) {
                    result += "a" + test1(choice);
                } else {
                    result = "n0";
                }
                break;
            }
        }
        return result;
    }

    public String test1(int a) {

        int idx = 3;
        for (int i = 1; i <= 7; i++) {
            if (a == i) {
                break;
            }
            if (i >= 4) {
                idx++;
            } else if (i < 4) {
                idx--;
            }
        }
        return String.valueOf(idx);
    }

}
