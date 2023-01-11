package Lv1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution36 {


    public static void main(String[] args) {
        solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"});
    }

    /**
     * @param today
     * @param terms
     * @param privacies
     * @return 개인정보 수집 유효기간
     * 문제 설명
     * 고객의 약관 동의를 얻어서 수집된 1~n번으로 분류되는 개인정보 n개가 있습니다. 약관 종류는 여러 가지 있으며 각 약관마다 개인정보 보관 유효기간이 정해져 있습니다. 당신은 각 개인정보가 어떤 약관으로 수집됐는지 알고 있습니다. 수집된 개인정보는 유효기간 전까지만 보관 가능하며, 유효기간이 지났다면 반드시 파기해야 합니다.
     * <p>
     * 예를 들어, A라는 약관의 유효기간이 12 달이고, 2021년 1월 5일에 수집된 개인정보가 A약관으로 수집되었다면 해당 개인정보는 2022년 1월 4일까지 보관 가능하며 2022년 1월 5일부터 파기해야 할 개인정보입니다.
     * 당신은 오늘 날짜로 파기해야 할 개인정보 번호들을 구하려 합니다.
     * <p>
     * 모든 달은 28일까지 있다고 가정합니다.
     * <p>
     * 다음은 오늘 날짜가 2022.05.19일 때의 예시입니다.
     */
    public static int[] solution(String today, String[] terms, String[] privacies) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Calendar cal = Calendar.getInstance();
        Queue<Integer> q = new LinkedList();
        Map<String, String> tMap = splitMap(terms);
        int cnt = 1;

        for (String pri : privacies) {
            String[] a = pri.split(" ");
            Calendar cal2 = Calendar.getInstance();

            try {
                Date todayDate = simpleDateFormat.parse(today);
                Date priDate = simpleDateFormat.parse(a[0]);

                cal.setTime(todayDate);
                cal2.setTime(priDate);
                String todayDateStr = simpleDateFormat.format(todayDate);
                cal2.add(Calendar.MONTH, Integer.parseInt(tMap.get(a[1])));

                int da = todayDate.compareTo(new Date(cal2.getTimeInMillis()));

                if (da >= 0) {
                    q.add(cnt);
                }
                cnt++;

            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }
        int[] answer = new int[q.size()];
        cnt = 0;
        for (int qq : q) {
            answer[cnt] = qq;
            cnt++;
            System.out.println("qq = " + qq);
        }

        return answer;
    }


    public static Map<String, String> splitMap(String[] arr) {
        HashMap<String, String> a = new HashMap<>();
        for (String cc : arr) {
            String[] arrr = cc.split(" ");
            a.put(arrr[0], arrr[1]);
        }
        return a;
    }


}