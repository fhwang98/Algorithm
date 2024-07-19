import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        if (people.length == 1) return 1;

        Arrays.sort(people);
        int answer = 0;
        int end = people.length - 1;

        for (int start = 0; start <= end; end--) {
            // 가장 가벼운 사람과 가장 무거운 사람을 함께 태울 수 있는지 확인
            if (people[start] + people[end] <= limit) {
                start++;
            }

            // 가장 무거운 한명 타거나 가장 무거운/가벼운 두명 탑승
            answer++;
        }

        return answer;
    }
}
