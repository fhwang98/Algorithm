import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }
        
        for (int i = 0; i <= discount.length - 10; i++) {
            HashMap<String, Integer> temp = new HashMap<>(map);
            for (int j = 0; j < 10; j++) {
                String item = discount[i + j];
                if (! temp.containsKey(item)) break;
                temp.put(item, temp.get(item) - 1);
                if (temp.get(item) == 0) temp.remove(item);
                
            }
            if (temp.isEmpty()) answer++;
        }
        return answer;
    }
}