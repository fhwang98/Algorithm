class Solution {
    public int solution(int n, int m, int[] section) {
        // 벽의 길이 n
        // 롤러의 길이 m
        // 새로 칠해야하는 구역의 배열 section
        // return : 칠해야하는 최소 횟수
        int answer = 0;
        int[] wall = new int[n];
        for (int s : section) {
            wall[s - 1] = 1;
        }
        int index = 0;
        while (index < wall.length) {
            //1이면 새로 칠해야함
            if (wall[index] == 1) {
                answer++;
                if (index + m >= wall.length) break;
                index += m -1;
            }
            index++;
        }
        
        return answer;
    }
}