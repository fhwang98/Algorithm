class Solution {
    public int solution(int n) {
        
        String bin = Integer.toBinaryString(n);
        bin = bin.replace("0", "");
        int cnt = bin.length();
        
        int answer = n + 1;
        while (true) {
            bin = Integer.toBinaryString(answer);
            bin = bin.replace("0", "");
            if (cnt == bin.length()) break;
            answer++;
            
        }
        return answer;
    }
}