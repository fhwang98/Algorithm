class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // (w + h - 2) * 2 = brown
        // w * h = yellow + brown
        int multi = yellow + brown;
        for (int h = 3; h <= multi; h++) {
            if (multi % h != 0) continue;
            int w = multi / h;
            if ((w + h - 2) * 2 == brown) {
                answer[0] = w;
                answer[1] = h;
                break;
            }
        }
        return answer;
    }
}