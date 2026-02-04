import java.io.*;
import java.util.*;

public class Main {

    static String[] white = {"WBWBWBWB", "BWBWBWBW"};
    static String[] black = {"BWBWBWBW", "WBWBWBWB"};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] board = new String[N];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int w = count(board, i, j, white);
                int b = count(board, i, j, black);

                min = Math.min(min, Math.min(w, b));
            }
        }

        bw.write(String.valueOf(min));
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }

    private static int count(String[] board, int row, int col, String[] pattern) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[row + i].charAt(col + j) != pattern[i % 2].charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

}