class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int idx = 0;
        int mLen = myString.length();
        int pLen = pat.length();
        while (idx <= mLen - pLen) {
            if (myString.substring(idx, idx + pLen).equals(pat)) answer++;
            idx++;
        }
        return answer;
    }
}