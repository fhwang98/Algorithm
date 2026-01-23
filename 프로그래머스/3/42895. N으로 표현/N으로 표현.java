import java.util.*;

class Solution {

    public int solution(int N, int number) {
        if (N == number) return 1;

        List<Set<Integer>> dp = new ArrayList<>();
        for (int i = 0; i <= 8; i++) dp.add(new HashSet<>());

        for (int k = 1; k <= 8; k++) {
            // 1) 이어붙인 수
            dp.get(k).add(concatN(N, k));

            // 2) 분할 조합
            for (int i = 1; i < k; i++) {
                Set<Integer> left = dp.get(i);
                Set<Integer> right = dp.get(k - i);
                combine(dp.get(k), left, right);
            }

            // 3) 목표 확인
            if (dp.get(k).contains(number)) return k;
        }

        return -1;
    }

    private int concatN(int N, int k) {
        int val = 0;
        for (int i = 0; i < k; i++) {
            val = val * 10 + N;
        }
        return val;
    }

    private void combine(Set<Integer> target, Set<Integer> left, Set<Integer> right) {
        for (int a : left) {
            for (int b : right) {
                target.add(a + b);
                target.add(a - b);
                target.add(a * b);
                if (b != 0) target.add(a / b);
            }
        }
    }
}
