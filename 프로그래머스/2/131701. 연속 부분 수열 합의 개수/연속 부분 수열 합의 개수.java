import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        int len = 0;
        for (int i = 0; i < elements.length; i++) {
            len = 1;
            for (int j = 0; j < elements.length; j++) {
                sum = 0;
                for (int k = 1; k <= len && len <= elements.length; k++) {
                    sum += elements[(i + k - 1) % elements.length];
                }
                set.add(sum);
                len++;
            }
        }
        return set.size();
    }
}