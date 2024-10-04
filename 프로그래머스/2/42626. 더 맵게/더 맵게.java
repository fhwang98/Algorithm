import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : scoville) {
            pq.add(s);
        }
        int answer = 0;
        while (pq.size() > 1) {
            if (pq.peek() >= K) break;
            pq.add(pq.poll() + pq.poll() * 2);
            answer++;
        }
        if (pq.peek() < K) answer = -1;
        return answer;
    }
}