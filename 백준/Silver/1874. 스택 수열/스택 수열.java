import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        // 4 3 6 8 7 5 2 1
        int N = Integer.parseInt(br.readLine());

        // 1부터 N까지 넣을 스택
        Stack<Integer> stack = new Stack<>();
        // 불가능한지
        boolean isPossible = true;
        int num = 1;
        for (int i = 0; i < N; i++) {
            int cur = Integer.parseInt(br.readLine());

            while (num <= cur) {
                stack.push(num);
                sb.append('+').append('\n');
                num++;
            }

            if (stack.peek() == cur) {
                stack.pop();
                sb.append('-').append('\n');
            } else {
                isPossible = false;
            }
        }

        bw.write(isPossible ? sb.toString() : "NO");

        bw.flush();
        bw.close();
        br.close();
     }

}