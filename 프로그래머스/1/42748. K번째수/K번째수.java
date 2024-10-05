import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] c : commands) {
            int[] temp = Arrays.copyOfRange(array, c[0] - 1, c[1]);
            Arrays.sort(temp);
            answer[idx++] = temp[c[2] - 1];
        }
        return answer;
    }
}