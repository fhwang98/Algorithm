import java.util.HashSet;
import java.util.Iterator;
class Solution {
    
    HashSet<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        // 재귀를 이용해서 모든 조합 만들기
        rec("", numbers);

        return set.size();
    }

    // 재귀를 이용한 조합 메소드
    public void rec (String temp, String n) {
        
        // 현재 조합을 set에 추가
        if(!temp.equals("")) {
            int cur = Integer.parseInt(temp);
            if (isPrime(cur)) set.add(cur);
        }

        // 나머지 숫자를 더해 조합 만들기
        for (int i = 0; i < n.length(); i++) {
            // 재귀 호출
            rec(temp + n.charAt(i), n.substring(0, i) + n.substring(i + 1));
        }
    }
    
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}