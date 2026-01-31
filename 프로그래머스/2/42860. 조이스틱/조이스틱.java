class Solution {
    public int solution(String name) {
        
        // 상하이동 빠른것
        // A BCDEFGHIJKLM 12 N 12 OPQRSTUVWXYZ
        // B ~ M 아래로 이동
        // N은 상관없이 13
        // O ~ P 는 위로 이동
        int upDown = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c > 'A' && c <= 'N') {
                upDown += c - 'A';
            } else if (c > 'N' && c <= 'Z') {
                upDown += 'Z' - c + 1;
            }
        }
        
        // 좌우이동 빠른것을 먼저 찾는다
        // 연속된 A를 통과 -> 개손해
        int leftRight = name.length() - 1;
        for (int i = 0; i < name.length() - 1; i++) {
            if (name.charAt(i + 1) != 'A') continue;
            // 다음에 만나는 A가 아닌 글자의 위치
            int nextIndex = i + 1; 
            while (nextIndex < name.length() && name.charAt(nextIndex) == 'A') {
                nextIndex++;
            }
            // 경우1. 0 ~ i 이동 + i ~ 0 이동 + 0 ~ nextIndex 뒤로 이동
            int right = 2 * i + name.length() - nextIndex;
            // 경우2. 0 ~ nextIndex 이동 + nextIndex ~ 0 이동 + 0 ~ i 이동
            int left = (name.length() - nextIndex) * 2 + i;
            
            leftRight = Math.min(leftRight, Math.min(left, right));
        }
        
        return upDown + leftRight;
    }
}