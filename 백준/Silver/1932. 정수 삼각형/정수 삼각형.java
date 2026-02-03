import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[][] triangle = new int[T][T];
        //   1
        //  2 3
        // 4 5 6 ...
        // triangle[i][j]까지 올수있는 경로
        // triangle[i-1][j-1]에서 오거나 triangle[i-1][j]
        // j 가 0일 경우 == 현재 + triangle[i-1][j]
        // j 가 i일경우 == 현재 + triangle[i-1][j-1]
        // 중간 == 현재 + 둘중큰수
        int result = 0;
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            if (i == 0) {
                triangle[0][0] = Integer.parseInt(st.nextToken());
                result = triangle[0][0];
                continue;
            }
            int length = st.countTokens();
            for (int j = 0; j < length; j++) {
                triangle[i][j] = Integer.parseInt(st.nextToken());
                if (j == 0) {
                    triangle[i][j] += triangle[i-1][j];
                } else if (j == i) {
                    triangle[i][j] += triangle[i-1][j - 1];
                } else {
                    triangle[i][j] += Math.max(triangle[i - 1][j], triangle[i - 1][j - 1]);
                }
                result = Math.max(result, triangle[i][j]);
            }
        }

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }

}