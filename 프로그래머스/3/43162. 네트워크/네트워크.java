class Solution {
    public int solution(int n, int[][] computers) {

        boolean[] visited = new boolean[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                count++;
                dfs(i, computers, visited);
            }
        }

        return count;
    }
    
    private void dfs(int node, int[][] computers, boolean[] visited) {
        
        visited[node] = true;

        for (int j = 0; j < computers.length; j++) {
            if (computers[node][j] == 1 && !visited[j]) {
                dfs(j, computers, visited);
            }
        }
    }
}