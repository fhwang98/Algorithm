import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            stack.clear();
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                // 괄호랑 똑같음
                char c = line.charAt(j);
                if (stack.isEmpty()) {
                    // 비어있다
                    stack.push(c);
                } else {
                    // 안비었는데
                    if (stack.peek() == c) {
                        // 전과 같다
                        stack.pop();
                    } else {
                        // 다르다
                        stack.push(c);
                    }
                }
            }
            if (stack.isEmpty()) sum++;
        }

        br.close();
        sb.append(sum);
        System.out.println(sb.toString());

    }
}