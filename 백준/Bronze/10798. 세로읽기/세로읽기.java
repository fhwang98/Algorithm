import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        List<String> list = new ArrayList<>();
        int maxLength = 0;
        for (int i = 0; i < 5; i ++) {
            String line = br.readLine();
            list.add(line);
            maxLength = Math.max(maxLength, line.length());
        }
        for (int i = 0; i < maxLength; i++) {
            for (String s : list) {
                if (i >= s.length()) continue;
                sb.append(s.charAt(i));
            }
        }


        br.close();
        System.out.println(sb.toString());

    }
}