class Solution {
    public String solution(String s) {
        String[] splited = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < splited.length; i++) {
            int n = Integer.parseInt(splited[i]);
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return min + " " + max;
    }
}