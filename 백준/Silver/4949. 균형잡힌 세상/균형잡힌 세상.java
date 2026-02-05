import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while (!(line = br.readLine()).equals(".")) {
            Stack<Character> stack = new Stack<>();
            boolean flag = true;
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    // 스택에서 꺼냈을떄 짝이 안맞다 > 실패
                    if (stack.isEmpty() || stack.peek() != '(') {
                        flag = false;
                        break;
                    }
                    stack.pop();
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        flag = false;
                        break;
                    }
                    stack.pop();
                } else continue;
            }
            if (!stack.isEmpty()) flag = false;
            bw.write(flag ? "yes" : "no");
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }

}