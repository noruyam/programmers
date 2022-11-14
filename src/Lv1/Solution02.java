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
        String test = "";
//        map.put("N", 2);
        for (int i = 0; i < survey.length; i++) {
            test = ChoiceScore(choices[i]).substring(0, 1);
            System.out.println("??" + ChoiceScore(choices[i]).substring(1));
            if ("d".equals(test)) {
                System.out.println(PersonalityType(test, survey[i]));
                if (null == map.get(PersonalityType(test, survey[i]))) {
                    map.put(PersonalityType(test, survey[i]), Integer.valueOf(ChoiceScore(choices[i]).substring(1)));
                } else {
                    map.put(PersonalityType(test, survey[i]), map.get(PersonalityType(test, survey[i])) + Integer.valueOf(ChoiceScore(choices[i]).substring(1)));
                }

            } else if ("a".equals(test)) {
                System.out.println(PersonalityType(test, survey[i]));
                if (null == map.get(PersonalityType(test, survey[i]))) {
                    map.put(PersonalityType(test, survey[i]), Integer.valueOf(ChoiceScore(choices[i]).substring(1)));
                } else {
                    map.put(PersonalityType(test, survey[i]), map.get(PersonalityType(test, survey[i])) + Integer.valueOf(ChoiceScore(choices[i]).substring(1)));
                }


            } else {
                System.out.println(test);
            }
        }


        return Fin(map);
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

    public String Fin(Map map) {
        String answer = "";
        int R, T, C, F, J, M, A, N;
        R = (int) map.getOrDefault("R", 0);
        T = (int) map.getOrDefault("T", 0);
        C = (int) map.getOrDefault("C", 0);
        F = (int) map.getOrDefault("F", 0);
        J = (int) map.getOrDefault("J", 0);
        M = (int) map.getOrDefault("M", 0);
        A = (int) map.getOrDefault("A", 0);
        N = (int) map.getOrDefault("N", 0);

        if (R > T) {
            answer += "R";
        } else {
            answer += "T";
        }
        if (C > F) {
            answer += "C";
        } else {
            answer += "F";
        }
        if (J > M) {
            answer += "J";
        } else {
            answer += "M";
        }
        if (A > N) {
            answer += "A";
        } else if (A == N) {
            answer += "A";
        } else {
            answer += "N";
        }
        System.out.println(A + " " + N + " " + answer);
        return answer;
    }
}
