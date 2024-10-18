class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean notChanged = true;
        int cur = 0;
        while (true) {
            notChanged = true;
            for (int i = 0; i < arr.length; i++) {
                cur = arr[i];
                if (cur >= 50 && cur % 2 == 0) {
                    arr[i] = cur / 2;
                    notChanged = false;
                } else if (cur < 50 && cur % 2 == 1) {
                    arr[i] = cur * 2 + 1;
                    notChanged = false;
                }
            }
            if (notChanged) break;
            answer++;
        }
        return answer;
    }
}