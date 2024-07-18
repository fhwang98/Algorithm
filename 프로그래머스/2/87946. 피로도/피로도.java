class Solution {

    public int solution(int k, int[][] dungeons) {
        return dfs(k, dungeons);
    }
    
    public int dfs(int k, int[][] dungeons) {
        int cnt = 0;
        for(int[] dungeon : dungeons) {
            int min = dungeon[0];
            int consume = dungeon[1];
            if(min <= k) {
                dungeon[0] = Integer.MAX_VALUE;
                cnt = Math.max(1 + dfs(k - consume, dungeons), cnt);
                dungeon[0] = min;
            }
        }
        return cnt;
    }
}