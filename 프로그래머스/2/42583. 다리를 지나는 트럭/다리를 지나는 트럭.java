import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        int onBridge = 0;
        for (int t : truck_weights) {
            // 다리 위에 뭐가 있다.
            while (!list.isEmpty()) {
                // 시간 경과
                answer++;
                // 다리 끝에 도착했으면 내려준다.
                if (list.size() == bridge_length) onBridge -= list.remove(0);
                // 태울 수 없다.
                if (onBridge + t > weight) list.add(0);
                // 태울 수 있다.
                else {
                    list.add(t);
                    onBridge += t;
                    break;
                }
            }
            // 다리 위에 아무것도 없다.
            if (list.isEmpty()) {
                answer++;
                list.add(t);
                onBridge += t; 
            }
        }
        return answer + bridge_length;
    }
}