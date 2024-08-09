class Solution {
    public boolean solution(int x) {
        int sum = sum(x);
        boolean answer = x % sum == 0 ? true : false;
        return answer;
    }
    public int sum(int x) {
        int result = 0;
        while (x > 0) {
            result += x % 10;
            x /= 10;
        }
        return result;
    }
}