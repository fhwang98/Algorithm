class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder(phone_number);
        for (int i = 0; i < answer.length() - 4; i++) {
            answer.replace(i, i + 1, "*");
        }
        return answer.toString();
    }
}