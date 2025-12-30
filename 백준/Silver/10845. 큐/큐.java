import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < count; i++) {
            String[] line = br.readLine().split(" ");

            switch (line[0]) {
                case "push":
                    queue.add(Integer.parseInt(line[1]));
                    break;
                case "pop":
                    sb.append(queue.isEmpty()? "-1" : queue.poll());
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(queue.size());
                    sb.append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty()? "1" : "0");
                    sb.append("\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty()? "-1" : queue.peek());
                    sb.append("\n");
                    break;
                case "back":
                    Queue<Integer> temp = new LinkedList<>(queue);
                    int last = -1;
                    while (!temp.isEmpty()) {
                         last = temp.poll();
                    }
                    sb.append(last);
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