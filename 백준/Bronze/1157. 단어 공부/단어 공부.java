import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine().toUpperCase();
        int[] alpha = new int[26];

        for (int i = 0; i < line.length(); i++) {
            alpha[line.charAt(i) - 'A']++;
        }

        int max = 0;
        for (int i = 0; i < alpha.length; i++) {
            max = Math.max(max, alpha[i]);
        }

        int index = -1;
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] == max && index == -1) {
                index = i;
            } else if (alpha[i] == max && index != -1) {
                index = -1;
                break;
            }
        }
        sb.append(index == -1 ? '?' : (char) (index + 'A'));

        br.close();
        System.out.println(sb.toString());

    }
}