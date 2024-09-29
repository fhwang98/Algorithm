import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        //set의 길이 >= nums의 길이 / 2 -> nums의 길이 / 2만큼 고를 수 있다.
        //set의 길이 < nums의 길이 / 2 -> set의 길이만큼 고를 수 있다.
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int answer = set.size() >= nums.length / 2 ? nums.length / 2 : set.size();
        return answer;
    }
}