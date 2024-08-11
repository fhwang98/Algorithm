class Solution {
    public long solution(int price, int money, int count) {
        
        long answer = money - (long)price * count * (count + 1) / 2 < 0 ? (long)price * count * (count + 1) / 2 - money : 0;

        return answer;
    }
}