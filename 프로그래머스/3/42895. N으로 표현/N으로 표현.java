class Solution {
    int answer = Integer.MAX_VALUE;
    int N;
    int number;

    public int solution(int N, int number) {
        this.N = N;
        this.number = number;
        dfs(0, 0);
        return (answer == Integer.MAX_VALUE) ? -1 : answer;
    }

    public void dfs(int count, int current) {
        if (count > 8) { // 8보다 크면 -1 반환 (최대 사용 가능한 N의 개수가 8개)
            return;
        }
        if (current == number) { // 현재 값이 찾고자 하는 값과 같다면
            answer = Math.min(answer, count); // 최소값 업데이트
            return;
        }

        int tempN = N;
        for (int i = 1; i <= 8 - count; i++) { 
            dfs(count + i, current + tempN);
            dfs(count + i, current - tempN);
            dfs(count + i, current * tempN);
            dfs(count + i, current / tempN);

            tempN = tempN * 10 + N; // N을 5 -> 55, 555, ... 과 같이 만들어줌
        }
    }
}
