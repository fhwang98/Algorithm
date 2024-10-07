import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int h = citations.length;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= h) break;
            h--;
        }
        return h;
    }
}