class Solution {
    public String[] solution(String[] str_list) {
        if (str_list.length == 1) return new String[] {};
        int idx = -1;
        boolean right = true;
        for (int i = 0; i < str_list.length ; i++) {
            if (str_list[i].equals("r") || str_list[i].equals("l")) {
                idx = i;
                if (str_list[i].equals("l")) right = false;
                break;
            }
        }
        if (idx == -1) return new String[] {};
        String[] answer = new String[right ? str_list.length - idx - 1 : idx];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = str_list[right ? i + idx + 1 : i];
        }
        return answer;
    }
}