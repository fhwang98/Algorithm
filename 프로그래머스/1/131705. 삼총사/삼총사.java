class Solution {
    int answer = 0;
    boolean[] visited;
    
    public int solution(int[] number) {
        // number.length 중에서 3개 고르는 경우의 수, 순서 x
        // n C 3
        visited = new boolean[number.length];
        comb(0, 0, 0, number);
        return answer;
    }
    public void comb(int idx, int depth, int cur, int[] number) {
        if (depth == 3) {
            if (cur == 0) answer++;
            return;
        }
        for (int i = idx; i < number.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                comb(i + 1, depth + 1, cur + number[i], number);
                visited[i] = false;
            }
        }
    }
}