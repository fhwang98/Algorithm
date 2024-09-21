class Solution {
    public int[] solution(int[] arr) {
        
        int start = -1;
        int end = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2 && start == -1) start = i;
            else if (arr[i] == 2 && start != -1) end = i;
        }
        
        if (start == -1 && end == -1) return new int[] {-1};
        else if (start != -1 && end == -1) return new int[] {arr[start]};
        
        int[] answer = new int[end - start + 1];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[i + start];
        }
        return answer;
    }
}