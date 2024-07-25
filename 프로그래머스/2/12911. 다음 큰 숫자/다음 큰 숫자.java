class Solution {
    public int solution(int n) {
        int answer = n + 1;
        while (true) {
            if (count(n) == count(answer)) return answer;
            answer++;
        }
    }
    public int count(int n) {
        int cnt = 0;
        while (n > 0) {
            if (n % 2 == 1)cnt++;
            n /= 2;
        }
        return cnt;
    }
}