class Solution {
    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int[] answer = {gcd, n * m / gcd};
        return answer;
    }
    public int gcd(int n, int m) {
        for (int i = Math.min(n, m); i > 0; i--) {
            if (n % i == 0 && m % i == 0) return i;
        }
        return 1;
    }
}