import java.util.HashMap;

public class Solution {
    private static int idx = 0;
    private static HashMap<String, Integer> dic = new HashMap<>();
    private static String[] vowels = {"A", "E", "I", "O", "U"};

    public static int solution(String word) {
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
