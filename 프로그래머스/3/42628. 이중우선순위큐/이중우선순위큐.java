import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0, 0};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for (String operation : operations) {
            String[] op = operation.split(" ");
            
            if (op[0].equals("I")) {
                int num = Integer.parseInt(op[1]);
                minHeap.offer(num);
                maxHeap.offer(num);
            } else if (op[0].equals("D")) {
                if (!minHeap.isEmpty()) {
                    if (op[1].equals("1")) {
                        int max = maxHeap.poll();
                        minHeap.remove(max);
                    } else {
                        int min = minHeap.poll();
                        maxHeap.remove(min);
                    }
                }
            }
        }
        
        if (!minHeap.isEmpty()) {
            answer[0] = maxHeap.peek();
            answer[1] = minHeap.peek();
        }
        
        return answer;
    }
}
