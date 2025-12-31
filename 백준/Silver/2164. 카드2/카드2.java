import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();

        int num = Integer.parseInt(line);

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            queue.offer(i + 1);
        }

        for (int i = 0; queue.size() > 1; i++) {
            if (i % 2 == 0) {
                queue.poll();
            } else {
                queue.offer(queue.poll());
            }
        }
        sb.append(queue.poll());

        br.close();
        System.out.println(sb.toString());

    }
}