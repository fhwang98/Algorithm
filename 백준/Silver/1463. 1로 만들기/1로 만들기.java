import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());// 1 <= X <= 1,000,000

        int[] dp = new int[X + 1];

        dp[1] = 0;
        // dp[i] 는 dp[i/3] dp[i/2] dp[i-1] 중에 작은것 + 1
        for (int i = 2; i <= X; i++) {
            dp[i] = dp[i - 1] + 1;
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
        }

        bw.write(String.valueOf(dp[X]));

        bw.flush();
        bw.close();
        br.close();
     }

}