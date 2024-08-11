class Solution {
    public String solution(String s) {
        char[] answer = s.toCharArray();
        char temp;
        for (int i = 0; i < answer.length - 1; i++) {
            for (int j = i; j < answer.length; j++) {
                if (answer[i] < answer[j]) {
                    temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        return String.valueOf(answer);
    }
}