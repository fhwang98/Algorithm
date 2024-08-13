class Solution {
    public int solution(int n) {
        String rev = "";
        while (n > 0) {
            rev += n % 3;
            n = n / 3;
        }
        int answer = 0;
        for (int i = 0; i < rev.length(); i++) {
            answer += Math.pow(3, rev.length() - i - 1) * (rev.charAt(i) - '0');
        }
        return answer;
    }
}