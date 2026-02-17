import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        boolean[][] adj = new boolean[N + 1][N + 1];
        for (int m = 0; m < M; m++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            adj[i][j] = true;
            adj[j][i] = true;

        }
        boolean[] visited = new boolean[N + 1];

        int count = dfs(1, adj, visited);

        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
        br.close();
    }

    private static int dfs(int cur, boolean[][] adj, boolean[] visited) {
        visited[cur] = true;
        int count = 0;

        for (int next = 1; next < adj.length; next++) {
            if (adj[cur][next] && !visited[next]) {
                count += 1 + dfs(next, adj, visited);
            }
        }

        return count;
    }

}
