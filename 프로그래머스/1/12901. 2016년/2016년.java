import java.util.Calendar;

class Solution {
    public String solution(int a, int b) {
        String[] dow = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int total = b;
        for (int i = 0; i < a - 1; i++) {
            total += days[i];
        }
        String answer = dow[(total + 4) % 7];
        return answer;
    }
}