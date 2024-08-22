import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int[] arr1 = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] arr2 = Arrays.copyOfRange(num_list, 0, n);
        int idx = 0;
        for (int i : arr1) {
            answer[idx++] = i;
        }
        for (int i : arr2) {
            answer[idx++] = i;
        }
        return answer;
    }
}