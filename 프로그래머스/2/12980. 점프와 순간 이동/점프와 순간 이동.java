import java.util.*;

public class Solution {
    public int solution(int n) {
    
        String s = Integer.toBinaryString(n).replace("0", "");

        return s.length();
    }
}