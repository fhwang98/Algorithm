import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String[] strs = new String[numbers.length];
        boolean allZero = true;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) allZero = false;
            strs[i] = Integer.toString(numbers[i]);
        }
        if (allZero) return "0";
        // 두 수를 합쳤을 때 결과가 더 큰 순으로 정렬
        Arrays.sort(strs, (s1, s2) -> {
            return (s2 + s1).compareTo(s1 + s2);
        });
        String answer = "";
        for (String s : strs) {
            answer += s;
        }
        return answer;
    }
}