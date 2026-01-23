import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
    
        int answer = 0;
        int[][] dp = new int[triangle.length][triangle.length];
        // triangle[i][j] 칸에 도착하는 경로
        // [i-1][j-1] 또는 [i-1][j]에서 오는 경우
        // 현재 경로까지 가능한 최대값
        dp[0][0] = triangle[0][0];
        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                int temp = triangle[i][j];
                // j가 0이면 dp[i-1][0] + 현재값
                if (j == 0) {
                    temp += dp[i-1][0];
                // j == i면 dp[i-1][j-1] + 현재값
                } else if (j == i) {
                    temp += dp[i-1][j-1];
                }
                // 중간이면 dp[i-1][j-1]와 dp[i-1][j] 중 큰 값 + 현재값
                else {
                    temp += Math.max(dp[i-1][j-1], dp[i-1][j]);
                }
                dp[i][j] = temp;
                
                answer = Math.max(answer, temp);
            }
        }
        return answer;
    }
}