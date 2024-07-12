import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        if (progresses.length == 1) return new int[]{1};
        
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int idx = 0;
        int pub = 0;
        
        while (idx < progresses.length) {
            
            pub = 0;
            
            for (int i = idx; i < progresses.length; i++) {
                progresses[i] += speeds[i];
            }
            
            while (idx < progresses.length && progresses[idx] >= 100) {
                pub++;
                idx++;
            }
            
            if (pub > 0) answer.add(pub);
            
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}