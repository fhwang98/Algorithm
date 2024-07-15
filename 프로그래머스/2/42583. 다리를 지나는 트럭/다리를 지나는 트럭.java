import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        //경과 시간
        int sec = 0;
        
        //다리 위의 트럭
        Queue<Integer> queue = new LinkedList<Integer>();
        
        //다리 위의 무게
        int onBridge = 0;
        
        //모든 트럭이 다리를 건널 때까지 반복
        for (int t : truck_weights) {
            
            //다리 위에 뭐가 있다
            while (!queue.isEmpty()) {
                
                //다리 위의 개수가 다리 길이를 넘어가지 않게
                if (queue.size() == bridge_length) {
                    onBridge -= queue.poll();
                }
                    
                //1초 경과
                sec++;

                //다리 위 무게 초과다
                if (onBridge + t > weight) {

                    //아무것도 안올라감
                    queue.add(0);        

                } else { //트럭이 다리에 올라갔다

                    queue.add(t);
                    onBridge += t;

                    //t가 다리에 올라갔으니까 다음으로 넘어감
                    break;

                }

                
            }
            
            //다리 위에 트럭이 없다
            if (queue.isEmpty()) {
                queue.add(t);
                onBridge += t;
                sec++;
            }
            
        }
        
        
        //총 경과 시간 + 마지막으로 올라간 트럭이 건너는 시간 = 다리의 길이
        return sec + bridge_length;
    }
}