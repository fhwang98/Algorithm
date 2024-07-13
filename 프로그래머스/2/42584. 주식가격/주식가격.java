class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int cur = 0;
        int sec = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            cur = prices[i];
            sec = 0;
            for (int j = i + 1; j < prices.length; j++) {
                sec++;
                if (prices[j] < cur) break;
            }
            answer[i] = sec;
        }
        return answer;
    }
}