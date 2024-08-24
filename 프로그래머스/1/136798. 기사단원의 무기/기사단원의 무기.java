class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] powers = new int[number];
        for (int i = 0; i < powers.length; i++) {
            powers[i] = count(i + 1);
        }
        for (int i = 0; i < powers.length; i++) {
            answer += (powers[i] > limit) ? power : powers[i];
        }
        return answer;
    }
    public int count(int n) {
        int count = 0;
        for (int i = 1; i <= n / i; i++) {
            if (n % i == 0) {
                count++;
                if (i != n / i) count++;
            } 
        }
        return count;
    }
}