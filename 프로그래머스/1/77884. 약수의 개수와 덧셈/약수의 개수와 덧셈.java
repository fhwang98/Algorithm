class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            answer += evenodd(i);
        }
        return answer;
    }
    public int evenodd(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) cnt++;
        }
        return cnt % 2 == 0 ? n : n * -1;
    }
}