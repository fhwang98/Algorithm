import java.util.HashSet;

class Solution {
    
    private HashSet<Integer> set;
    private int cur;
    
    public int solution(String numbers) {
        set = new HashSet<Integer>();
        rec("", numbers);
        return set.size();
    }
    
    public void rec(String s, String numbers) {
        
        if (!s.equals("")) {
            cur = Integer.parseInt(s);
            if (isPrime(cur)) set.add(cur);
        }
        
        for (int i = 0; i < numbers.length(); i++) {
            rec(s + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i + 1));
        }
    }
    
    public boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}