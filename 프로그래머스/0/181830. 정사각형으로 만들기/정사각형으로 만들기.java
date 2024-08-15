class Solution {
    public int[][] solution(int[][] arr) {
        int max = arr.length;
        for (int[] a : arr) {
            max = Math.max(max, a.length);
        }
        int[][] answer = new int[max][max];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}