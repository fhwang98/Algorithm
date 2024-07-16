import java.util.stream.Stream;
import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        
        if (Arrays.stream(numbers).allMatch(n -> n == 0)) return "0";
        
        StringBuilder answer = new StringBuilder("");

        //두 수를 합쳤을 때 결과가 더 큰 순으로 정렬
        String[] strings = Arrays.stream(numbers)
                                  .mapToObj(String::valueOf)
                                  .sorted((a, b) -> (b + a).compareTo(a + b))
                                  .toArray(String[]::new);

        for (String str : strings) {
            answer.append(str);
        }

        return answer.toString();
    }
}
