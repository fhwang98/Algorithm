class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0, 0};
        //yellow = w * h
        //brown = (w + h) * 2 + 4
        //일차식 풀이
            
        for (int h = 1; h <= yellow; h++) {
            if (yellow % h != 0) continue;
            int w = yellow / h;
            if ((w + h + 2) * 2 == brown) {
                answer[0] = w + 2;
                answer[1] = h + 2;
                break;
            }
        }

        return answer;
    }
}