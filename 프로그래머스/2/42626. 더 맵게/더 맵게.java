import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        // 우선순위 낮은것 = 작은 숫자부터 나옴
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int s : scoville) {
            pq.add(s);
        }

        //더이상 섞을 수 없을 때까지 반복
        while (pq.size() > 1) {
            
            //모든 음식의 스코빌이 K 이상 > 섞은 횟수 반환
            if (pq.peek() >= K) return answer;
            
            //섞는다
            pq.add(pq.poll() + pq.poll() * 2);
            //섞은 횟수 증가
            answer++;
            
        }
        
        // 꺼냈을때 K 이상이면 섞은 횟수, 아니면 -1 반환
        return pq.peek() >= K ? answer : -1;
    }
}