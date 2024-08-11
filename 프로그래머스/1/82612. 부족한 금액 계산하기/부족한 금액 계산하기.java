class Solution {
    public long solution(int price, int money, int count) {
        
        long answer = Math.max((long)price * count * (count + 1) / 2 - money, 0);

        return answer;
    }
}