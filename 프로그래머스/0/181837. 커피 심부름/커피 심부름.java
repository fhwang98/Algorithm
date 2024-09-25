class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for (String o : order) {
            if (o.contains("latte")) {
                answer += 5000;
            } else if (o.contains("americano") || o.equals("anything")) {
                answer += 4500;
            }
        }
        return answer;
    }
}