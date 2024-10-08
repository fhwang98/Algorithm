class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        for (int n : arr) {
            answer = lcm(n, answer);
        }
        return answer;
    }
    public int lcm(int n, int m) {
        //1. 최대공약수를 구한다
        //2. 최소공배수 = n * m / gcd
        for (int i = Math.min(n, m); i > 0; i--) {
            if (n % i == 0 && m % i == 0) {
                return n * m / i;
            }
        }
        return n * m;
    }
}