class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            char cur = my_string.charAt(i);
            if (cur >= 'A' && cur <= 'Z') answer[cur - 'A']++;
            else if (cur >= 'a' && cur <= 'z') answer[cur - 'a' + 26]++;
        }
        return answer;
    }
}