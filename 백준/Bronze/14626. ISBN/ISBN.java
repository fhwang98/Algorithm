import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // ISBN
        String line = br.readLine();

        int m = line.charAt(line.length() - 1) - '0';
        int index = line.indexOf('*');
        int weight = index % 2 == 0 ? 1 : 3;

        long sum = 0;
        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) == '*') continue;
            int cur = line.charAt(i) - '0';
            sum += i % 2 == 0 ? cur : cur * 3;
        }

        for (int i = 0; i < 10; i++) {
            if ((sum + i * weight + m) % 10 == 0) {
                bw.write(i + "\n");
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

}