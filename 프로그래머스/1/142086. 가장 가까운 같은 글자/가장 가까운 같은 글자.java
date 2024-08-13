import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        
        int[] answer = new int[s.length()];
        int[] alphabet = new int[26];
        int idx;
        Arrays.fill(alphabet, -1);
        
        for (int i = 0; i < answer.length; i++) {
            idx = s.charAt(i) - 'a';
            answer[i] = alphabet[idx] == -1 ? -1 : i - alphabet[idx];
            alphabet[idx] = i;
        }
        return answer;
    }
}