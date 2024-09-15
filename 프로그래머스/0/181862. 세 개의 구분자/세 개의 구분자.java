import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

class Solution {
    public String[] solution(String myStr) {
        if (myStr.replace("a","").replace("b","").replace("c","").equals("")) return new String[] {"EMPTY"};
        List<String> answer = new ArrayList<>();
        StringBuilder temp = new StringBuilder("");
        for (int i = 0; i < myStr.length(); i++) {
            char cur = myStr.charAt(i);
            if (cur == 'a' || cur == 'b' || cur == 'c') {
                if (!temp.toString().equals("")) {
                    answer.add(temp.toString());
                    temp.setLength(0);
                }
            } else {
                temp.append(cur);
            }
        }
        if (!temp.toString().equals("")) answer.add(temp.toString());
        return answer.stream().toArray(String[]::new);
    }
}