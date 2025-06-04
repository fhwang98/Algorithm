import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        //정렬해서 큰수x작은수
        Arrays.sort(A);
        Arrays.sort(B);
        
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - 1 - i];
        }
        

        return answer;
    }
    
    
}