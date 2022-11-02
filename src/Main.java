import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] fees = {180, 5000, 10, 600};

//        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        String[] records = {"00:00 1234 IN"};
        s.solution(fees, records);


    }


    static class Solution {
        public int[] solution(int[] fees, String[] records) {

            String[] re = new String[3];
            Map map = new HashMap<>();
            Map map2 = new HashMap<>();

            for (int i = 0; i < records.length; i++) {
                re = records[i].split(" ");
                String[] test = {re[0], re[2]};
                if ("IN".equals(re[2])) {

                    map.put(re[1], test);
                } else {
                    String[] tt = (String[]) map.get(re[1]);
                    int time = checkTime(tt[0], re[0]);
                    int rr = parking(fees, checkTime(tt[0], re[0]));
                    if (null == (map2.get(re[1]))) {
                        map2.put(re[1], time);
                    } else {
                        int ii = (int) map2.get(re[1]);
                        map2.put(re[1], ii + time);
                    }
                    map.remove(re[1]);
                }

            }
            if (map.isEmpty() == false) {
                for (Object key : map.keySet()) {
                    String[] bb = (String[]) map.get(key);
                    String cc = bb[0];
                    int a = checkTime(cc, "23:59");
                    if (map2.get(key) == null) {
                        map2.put(key, a);
                    } else {
                        map2.put(key, (int) map2.get(key) + a);
                    }
                }
            }
            for (Object key : map2.keySet()) {
                map2.put(key, parking(fees, (int) map2.get(key)));
            }
            List<String> keySet = new ArrayList<>(map2.keySet());
            Collections.sort(keySet);
            int[] answer = new int[keySet.size()];
            int i = 0;
            for (String key : keySet) {
                answer[i] = (int) map2.get(key);
                i++;
            }
            return answer;
        }

        public int parking(int[] fees, int a) {
            int result = 0;
            if (a <= fees[0]) {
                result = fees[1];
            } else {
                result = allim(a, fees);
            }
            return result;
        }

        public int checkTime(String a, String b) {

            SimpleDateFormat f = new SimpleDateFormat("HH:mm", Locale.KOREA);
            int result = 0;
            try {
                Date d1 = f.parse(a);
                Date d2 = f.parse(b);
                result = (int) ((d2.getTime() - d1.getTime()) / 60000);

            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            return result;
        }

        public int allim(int a, int[] b) {
            double c = 0;
            int result = 0;

            if (Math.abs(a - b[0]) < b[2]) {
                result = (1 * b[3]) + b[1];
            } else {

                c = ((double) a - b[0]) / b[2];

                result = ((int) Math.ceil(c) * b[3] + b[1]);
            }

            return result;
        }
    }


}