import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 정점의 개수
        int N = Integer.parseInt(st.nextToken());
        // 간선의 개수
        int M = Integer.parseInt(st.nextToken());
        // 탐색 시작 번호
        int V = Integer.parseInt(st.nextToken());

        // 인접 리스트
        List<Integer>[] list = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }
        for (int i = 1; i <= N; i++) {
            Collections.sort(list[i]);
        }

        StringBuilder sb = new StringBuilder();
        boolean[] visited = new boolean[N + 1];
        dfs(V, list, visited, sb);
        sb.append('\n');
        visited = new boolean[N + 1];
        bfs(V, list, visited, sb);

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
     }

    private static void dfs(int v, List<Integer>[] list, boolean[] visited, StringBuilder sb) {
        visited[v] = true;
        sb.append(v).append(' ');

        for (int next : list[v]) {
            if (!visited[next]) {
                dfs(next, list, visited, sb);
            }
        }
    }

    private static void bfs(int v, List<Integer>[] list, boolean[] visited, StringBuilder sb) {
        Queue<Integer> q = new ArrayDeque<>();
        visited[v] = true;
        q.add(v);

        while (!q.isEmpty()) {
            int cur = q.poll();
            sb.append(cur).append(' ');

            for (int next : list[cur]) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.add(next);
                }
            }
        }
    }



}