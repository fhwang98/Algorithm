class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;

        while (a > 0 && b > 0) {
            if ((a - 1) / 2 == (b - 1) / 2) {
                return answer;
            }
            a = a % 2 == 0 ? a / 2 : a / 2 + 1;
            b = b % 2 == 0 ? b / 2 : b / 2 + 1;
            answer++;
        }
        

        return answer;
    }
}