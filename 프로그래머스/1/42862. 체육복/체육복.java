import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        //students 배열 안에 체육복의 개수 저장
        int[] students = new int[n];

        for (int i = 0; i < lost.length; i++) {
            students[lost[i] - 1]--;
        }
        
        for (int i = 0; i < reserve.length; i++) {
            students[reserve[i] - 1]++;
        }

        for (int i = 0; i < n; i++) {
            if (students[i] == -1) { // 도난당했다
                if (i != 0 && students[i - 1] == 1) { // 앞사람이 두개있다
                    students[i - 1]--;
                    students[i]++;
                } else if (i != n - 1 && students[i + 1] == 1) { // 뒷사람이 두개있다
                    students[i + 1]--;
                    students[i]++;
                }
            }
        }
        
        for (int no : students) {
            if (no > -1) {
                answer++;
            }
        }
        return answer;
    }
}