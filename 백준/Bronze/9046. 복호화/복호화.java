import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < count; i++) {
            map.clear();
            String line = br.readLine().replace(" ", "");
            for (char c : line.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            char result = '?';
            List<Character> clist = new ArrayList<>();
            for(Character c : map.keySet()) {
                if (map.get(c).equals(Collections.max(map.values()))) {
                    clist.add(c);
                }
            }
            if (clist.size() == 1) {
                result = clist.get(0);
            }
            sb.append(result);
            sb.append("\n");
        }
        br.close();
        // 출력
        System.out.println(sb.toString());

    }
}