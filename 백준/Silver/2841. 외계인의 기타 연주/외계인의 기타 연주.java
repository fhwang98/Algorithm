import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        Stack<Integer>[] stacks = new Stack[7];
        for (int i = 1; i <= 6; i++) {
            stacks[i] = new Stack<Integer>();
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            // 줄의 번호
            int n = Integer.parseInt(st.nextToken());
            // 해당 줄에서 눌러야 하는 프렛
            int p = Integer.parseInt(st.nextToken());
            // 줄 안눌렀거나, 누르고있는 가장 높은것보다 p가 높다 > 스택에 추가
            if (stacks[n].isEmpty() || stacks[n].peek() < p) {
                stacks[n].push(p);
                count++;
            } else if (stacks[n].peek() > p) {
                // p를 누르고있다 > p가 나올떼까지 손가락 뗌
                if (stacks[n].contains(p)) {
                    while (stacks[n].peek() != p) {
                        stacks[n].pop();
                        count++;
                    }
                // p 안누르고있다 그럼 p보다 큰값까지 손가락 떼고 p 누름
                } else {
                    while (!stacks[n].isEmpty() && stacks[n].peek() > p) {
                        stacks[n].pop();
                        count++;
                    }
                    stacks[n].push(p);
                    count++;
                }
            }

        }

        bw.write(count + "\n");


        bw.flush();
        bw.close();
        br.close();
    }
}
