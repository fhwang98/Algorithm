import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 필드의 수
        int N = Integer.parseInt(st.nextToken());
        boolean[] obst = new boolean[N + 1];
        // 도착할 번호
        int Z = Integer.parseInt(st.nextToken());
        // 장애물 개수
        int M = Integer.parseInt(st.nextToken());
        if (M != 0) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                obst[Integer.parseInt(st.nextToken())] = true;
            }
        }
        
        // k == 점프 크기 최솟값
        outer:
        for (int k = 1; k < N; k++) {
            boolean[] visited = new boolean[N + 1];
            int cur = 1;

            while (true) {
                if (cur == Z) {
                    bw.write(String.valueOf(k));
                    break outer;
                }
                if (obst[cur]) break;
                if (visited[cur]) break;
                visited[cur] = true;

                int next = (cur + k) % N;
                cur = next == 0 ? N : next;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
