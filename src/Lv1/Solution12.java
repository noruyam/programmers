package Lv1;

public class Solution12 {
    /**
     * @param s
     * @return 가운데 글자 가져오기
     * 문제 설명
     * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
     * <p>
     * 재한사항
     * s는 길이가 1 이상, 100이하인 스트링입니다.
     */
    public String solution(String s) {
        String answer = "";
        int qks = s.length() / 2;
        if (s.length() % 2 == 0) {
            answer = s.substring(qks-1, qks + 1);
        } else {
            answer = s.substring(qks, qks + 1);
        }
        return answer;
    }
}

