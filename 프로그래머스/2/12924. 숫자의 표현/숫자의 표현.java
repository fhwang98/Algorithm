class Solution {
    public int solution(int n) {
        int answer = 1;
        int num = 0;
        for (int i = 1; i <= n / 2; i++) {
            num = 0;
            for (int j = i; num < n; j++) {
                num += j;
            }
            if (num == n) answer++;
        }
        return answer;
    }
}