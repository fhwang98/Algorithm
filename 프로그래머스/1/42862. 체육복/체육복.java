class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n];
        for (int i = 0; i < lost.length; i++) {
            students[lost[i] - 1]--;
        }
        for (int i = 0; i < reserve.length; i++) {
            students[reserve[i] - 1]++;
        }
        
        for (int i = 0; i < students.length - 1; i++) {
            // 인접한 학생들끼리만 빌릴 수 있음
            // 지금학생기준으로
            // 내가 없다 -> 뒤에서 가져온다
            // 내가 남는다 -> 뒤로 보낸다
            if (students[i] == -1 && students[i + 1] == 1) {
                students[i]++;
                students[i + 1]--;
            } else if (students[i] == 1 && students[i + 1] == -1) {
                students[i]--;
                students[i + 1]++;
            }
        }
        for (int s : students) {
            if (s > -1) answer++;
        }
        return answer;
    }
}