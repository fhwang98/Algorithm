import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // nCk > n개중에 k개 고르는 조합(순서x)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] comb = new int[N + 1][N + 1];
        comb[0][0] = 1;
        for (int i = 1; i <= N; i++) {
            comb[i][0] = 1;
            comb[i][i] = 1;
            for (int j = 1; j <= i - 1; j++) {
                comb[i][j] = comb[i-1][j-1] + comb[i-1][j];
            }
        }

        //이항계수 출력
        bw.write(String.valueOf(comb[N][K]));
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }

}