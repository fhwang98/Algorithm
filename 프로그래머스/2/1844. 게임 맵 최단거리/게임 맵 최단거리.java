import java.util.*;

class Solution {
    // 이동 방향을 저장하는 배열
    int[] dx = {0, 1, 0, -1};
    int[] dy = {-1, 0, 1, 0};
    
    // 방문 여부를 저장하는 배열
    boolean[][] visited;

    public int solution(int[][] maps) {
        
        int n = maps.length; // 행의 개수
        int m = maps[0].length; // 열의 개수
        visited = new boolean[n][m]; // 방문 여부 배열 초기화

        // BFS를 위한 큐 초기화
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0, 1}); // 시작 지점을 큐에 추가
        visited[0][0] = true; // 시작 지점 방문 표시

        while (!q.isEmpty()) {
            int[] node = q.poll(); // 큐에서 노드를 꺼냄

            // 도착 지점에 도달하면 이동 횟수 반환
            if (node[0] == n - 1 && node[1] == m - 1) {
                return node[2];
            }

            // 네 방향에 대해 이동 가능한지 확인
            for (int i = 0; i < 4; i++) {
                int nx = node[0] + dx[i]; // 다음 행
                int ny = node[1] + dy[i]; // 다음 열

                // 맵 범위 내에 있고, 이동 가능하며, 아직 방문하지 않았다면 큐에 추가
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    q.add(new int[]{nx, ny, node[2] + 1});
                    visited[nx][ny] = true; // 방문 표시
                }
            }
        }

        // 도착 지점에 도달하지 못한 경우 -1 반환
        return -1;
    }
}