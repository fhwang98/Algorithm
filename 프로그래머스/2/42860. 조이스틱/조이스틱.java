class Solution {
    public int solution(String name) {
        
        int answer = 0;
        int length = name.length();
        int endA = 0; 
        int move = length - 1; 

        for(int i = 0; i < length; i++){
            
            // 상하 이동 횟수 중 작은 횟수
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            // 연속된 마지막 A 찾기
            endA = i + 1;
            while(endA < length && name.charAt(endA) == 'A'){
                endA++;
            }

            // 좌우 이동 횟수 중 작은 것
            move = Math.min(move, i * 2 + (length - endA));// 순서대로 가기
            move = Math.min(move, i + (length - endA) * 2);// 뒤로 돌아 가기
        }
        return answer + move;
    }
}