class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        // 삼각형 꼭대기에서 바닥까지 거쳐간 숫자의 합이 가장 큰 경우
        // 아래로 내려갈 때 대각선 양쪽 한칸만 이동 가능
        // triangle[i][j] 에 도착하는 경로
        // triangle[i-1][j] 에서 오거나 triangle[i-1][j-1]에서 오는경우
        // dp[i][j]는 dp[i-1][j] dp[i-1][j-1] 중 큰 값 + triangle[i][j]
        int[][] dp = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];
        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i-1][j] + triangle[i][j];
                } else if (j == i) {
                    dp[i][j] = dp[i-1][j-1] + triangle[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]) + triangle[i][j];
                }   
                answer = Math.max(answer, dp[i][j]);
            }
        }
        return answer;
    }
}