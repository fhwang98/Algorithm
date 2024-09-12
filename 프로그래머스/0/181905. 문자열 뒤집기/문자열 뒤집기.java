class Solution {
    public String solution(String my_string, int s, int e) {
        String head = my_string.substring(0, s);
        StringBuilder body = new StringBuilder(my_string.substring(s, e + 1));
        
        String tail = my_string.substring(e + 1, my_string.length());
        return head + body.reverse().toString() + tail;
    }
}