class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder("0");
        for (int i = food.length - 1; i >= 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer.insert(0, String.valueOf(i));
                answer.append(String.valueOf(i));
            }
        }
        return answer.toString();
    }
}