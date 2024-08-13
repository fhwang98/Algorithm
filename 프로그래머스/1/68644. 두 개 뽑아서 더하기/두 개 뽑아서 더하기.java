import java.util.TreeSet;
import java.util.stream.Stream;

class Solution {
    
    public int[] solution(int[] numbers) {
        
        //n C 2
        
        TreeSet<Integer> set = new TreeSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) continue;
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        return set.stream().mapToInt(i->i).toArray();
    }
}