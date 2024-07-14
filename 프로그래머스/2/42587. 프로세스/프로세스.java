import java.util.ArrayList;
import java.util.stream.Stream;

class Solution {
    public int solution(int[] priorities, int location) {
        
        int order = 1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int pub = 0;
        
        for (int p : priorities) {
            list.add(p);
        }
        
        //리스트가 빌 때까지 반복
        while (!list.isEmpty()) {
            
            int cur = list.get(0);
            
            //뒤에 우선순위가 높은 프로세스가 있는지 확인
            if (list.stream().anyMatch(n -> n > cur)) {
                
                //있으면 맨 뒷 순서로 이동
                list.add(list.remove(0));
                
                //location이 맨 앞이었으면 맨 뒤로 이동
                if (location == 0) {
                    location = list.size() - 1;
                } else { // 아니면 하나 줄여줌
                    location--;
                }
                
            } else {
                //지금 우선순위가 가장 높다
                
                //지금 실행할 차례다
                if (location == 0) {
                    //순서를 반환
                    return order;
                }
                
                //실행됐으면 리스트에서 삭제 & 순서++
                //location도 줄여줌
                list.remove(0);
                order++;
                location--;

            }
        }
        
        return order;
    }
}