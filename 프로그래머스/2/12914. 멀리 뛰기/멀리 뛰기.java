class Solution {
    public long solution(int n) {
        if (n <= 2) return n;

        int aN = 0;
        int a1 = 1;
        int a2 = 2;
        for (int i = 3; i<= n; i++) {
            aN = (a1 + a2) % 1234567;
            a1 = a2;
            a2 = aN;
        }
        return aN;
    }
}