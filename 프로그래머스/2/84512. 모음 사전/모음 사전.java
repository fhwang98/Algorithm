import java.util.HashMap;

public class Solution {
    private static int idx;
    private static HashMap<String, Integer> dic;
    private static String[] vowels;

    public static int solution(String word) {
        idx = 0;
        dic = new HashMap<String, Integer>();
        vowels = new String[] {"A", "E", "I", "O", "U"};
        
        dfs("", 0);
        return dic.get(word);
    }

    private static void dfs(String word, int length) {
        if (length > 5) return;
        dic.put(word, idx++);
        for (String vowel : vowels) {
            dfs(word + vowel, length + 1);
        }
    }
}
