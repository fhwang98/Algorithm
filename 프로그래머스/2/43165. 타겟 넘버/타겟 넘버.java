class Solution {
    public int solution(int[] numbers, int target) {
        // 1) DFS를 시작한다.
        //    - index: 0 (첫 번째 숫자부터)
        //    - sum: 0 (아직 아무것도 더하지 않음)
        // 2) DFS가 반환하는 값은 "정답이 되는 경우의 수"
        return dfs(numbers, target, 0, 0);
    }
    private int dfs(int[] numbers, int target, int index, int sum) {
        // [종료 조건]
        // 모든 숫자를 다 사용했다면(index == numbers.length):
        //   - 현재 sum이 target이면 이 경로는 정답 1개이므로 1을 반환
        //   - 아니면 정답이 아니므로 0을 반환
        if (index == numbers.length) {
            if (sum == target) return 1;
            else return 0;
        }

        // [선택/분기]
        // 아직 숫자가 남아 있다면:
        //   현재 숫자 numbers[index]에 대해
        //   1) + 를 붙이는 선택: 다음 index로 넘어가며 sum에 더한다
        int plus = dfs(numbers, target, index + 1, sum + numbers[index]);
        //   2) - 를 붙이는 선택: 다음 index로 넘어가며 sum에서 뺀다
        int minus = dfs(numbers, target, index + 1, sum - numbers[index]);

        // [결과 합치기]
        // 위 두 선택으로부터 나온 "정답 개수"를 더해서 반환한다.
        return plus + minus;
    }
}