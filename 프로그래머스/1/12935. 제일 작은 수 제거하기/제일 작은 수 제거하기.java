class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[] {-1};
        int[] answer = new int[arr.length - 1];
        int min = Integer.MAX_VALUE;
        for (int n : arr) {
            min = Math.min(min, n);
        }
        int idx = 0;
        for (int n : arr) {
            if (n == min) continue;
            answer[idx++] = n;
        }
        return answer;
    }
}