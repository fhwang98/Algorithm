import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int answer = (nums.length / 2 > set.size()) ? set.size() : nums.length / 2;
        return answer;
    }
}