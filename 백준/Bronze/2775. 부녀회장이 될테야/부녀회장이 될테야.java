import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine()); // 0층부터 K층까지
            int n = Integer.parseInt(br.readLine()); // 1호부터 n호까지
            // (K,n) 에 사는 사람의 수
            // == (K-1,1)...(K-1,n) 합한 수
            int[][] dp = new int[K + 1][n + 1];
            for (int j = 1; j <= n; j++) {
                dp[0][j] = j;
            }
            for (int x = 1; x <= K; x++) {
                for (int y = 1; y <= n; y++) {
                    dp[x][y] = dp[x][y - 1] + dp[x - 1][y];
                }
            }

            bw.write(String.valueOf(dp[K][n]));
            bw.newLine();

        }
        bw.flush();
        bw.close();
        br.close();
    }

}