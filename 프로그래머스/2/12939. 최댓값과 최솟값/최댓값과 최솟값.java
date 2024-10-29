class Solution {
    public String solution(String s) {
        String[] nums = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int cur = Integer.parseInt(nums[i]);
            max = Math.max(max, cur);
            min = Math.min(min, cur);
        }
        String answer = "";
        answer += Integer.toString(min);
        answer += " ";
        answer += Integer.toString(max);
        return answer;
    }
}