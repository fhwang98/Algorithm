import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        HashSet<String> set = new HashSet<>();
        String last = "";
        String s = "";
        for (int i = 0; i < words.length; i++) {
            
            s = words[i];
            
            //탈락
            if (s.length() == 1 || // 한글자 단어
                set.contains(s) || // 이전에 등장한 단어
                !s.startsWith(last)) { // 앞단어 마지막 문자
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            } else {
                set.add(s);
                last = s.substring(s.length() - 1, s.length());
            }
        }

        return answer;
    }
}