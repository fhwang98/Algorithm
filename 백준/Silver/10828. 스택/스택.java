import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < count; i++) {
            String[] line = br.readLine().split(" ");

            switch (line[0]) {
                case "push":
                    stack.push(Integer.parseInt(line[1]));
                    break;
                case "pop":
                    sb.append(stack.isEmpty()? "-1" : stack.pop());
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(stack.size());
                    sb.append("\n");
                    break;
                case "empty":
                    sb.append(stack.isEmpty()? "1" : "0");
                    sb.append("\n");
                    break;
                case "top":
                    sb.append(stack.isEmpty()? "-1" : stack.peek());
                    sb.append("\n");
                    break;
                default:
                    break;
            }

        }
        br.close();
        System.out.println(sb.toString());

    }
}