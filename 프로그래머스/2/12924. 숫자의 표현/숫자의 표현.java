class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = i;
            for (int j = i + 1; j <= n; j++) {
                if (sum >= n) break;
                sum += j;
            }
            if (sum == n) answer++;
        }
        return answer;
    }
}