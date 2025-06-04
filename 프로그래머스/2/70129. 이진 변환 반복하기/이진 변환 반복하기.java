class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        // answer[0] : 이진 변환의 횟수
        // answer[1] : 제거된 0의 개수
        
        int len;
        
        while (!s.equals("1")) {
            len = s.length();
            s = s.replace("0", "");
            answer[1] += len - s.length();

            s = Integer.toBinaryString(s.length());
            answer[0]++;
        }
        
        return answer;
    }
}