class Solution {
    public int solution(int m, int n, int[][] puddles) {
        
        //dp[i][j] = (1,1)에서 (i,j)까지 가는 경로의 개수
        int[][] dp = new int[m + 1][n + 1];
        dp[1][1] = 1;
        for (int i = 0; i < puddles.length; i++) {
            dp[puddles[i][0]][puddles[i][1]] = -1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                if (i == 1 && j == 1) continue;
                
                // 위에서 한칸 내려오거나 왼쪽에서 한칸 오는 경로
                // 현재칸이 -1이면 막힘
                if (dp[i][j] == -1) continue;

                int fromUp = 0;
                int fromLeft = 0;

                if (i > 1 && dp[i-1][j] != -1) fromUp = dp[i-1][j];
                if (j > 1 && dp[i][j-1] != -1) fromLeft = dp[i][j-1];

                dp[i][j] = (fromUp + fromLeft) % 1000000007;
            }
        }
        return dp[m][n];
    }
}