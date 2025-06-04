class Solution {
    public String solution(String s) {
        
        StringBuilder answer = new StringBuilder(s.toLowerCase());
        boolean flag = true;
        
        for (int i = 0; i < answer.length(); i++) {
            char c = answer.charAt(i);

            if (c == ' ') {
                flag = true;  
            } else if (!flag) {
                continue;
            } else if (c >= 'a' && c <= 'z') {
                //이전에 공백이었으면서 소문자
                //대문자로 교체
                answer.deleteCharAt(i);
                answer.insert(i, Character.toUpperCase(c));
                flag = false;
            } else {
                //이전에 공백이었는데 숫자
                flag = false;
            }
        }
        return answer.toString();
    }
}