import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        while (answer < d.length) {
            if (budget < d[answer]) break;
            budget -= d[answer++];
        }
        return answer;
    }
}