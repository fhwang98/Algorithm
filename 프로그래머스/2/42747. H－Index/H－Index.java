import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int solution(int[] citations) {
        
        if (Arrays.stream(citations).allMatch(n->n==0)) return 0;
        
        int h = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            h = citations.length - i;
            if (citations[i] >= h) return h;
        }
        return h;
    }
}