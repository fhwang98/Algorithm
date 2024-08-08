class Solution {
    public int[] solution(long n) {
        
        int len = len(n);
        int[] answer = new int[len];
            
        for (int i = 0; i < len; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        
        return answer;
    }
    
    public int len(long n) {
        if (n == 0) return 1;
        int length = 0;
        while (n > 0){
            length++;
            n /= 10;
        }
        return length;
    }
}