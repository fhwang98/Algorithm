import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String my_string, int[] indices) {
        
        List<Integer> list = new ArrayList<>();
        for (int i : indices) {
            list.add(i);
        }
        
        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < my_string.length(); i++) {
            if (!list.contains(i)) answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }
}