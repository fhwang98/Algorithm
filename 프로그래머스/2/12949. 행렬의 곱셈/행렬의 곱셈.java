class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        //C[i][j] = A[i][1]B[1][j] + A[i][2]B[2][j] + ... + A[i][n]*B[n][j]
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for (int i = 0; i < answer.length; i++) { 
            for (int j = 0; j < answer[i].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        return answer;
    }
}