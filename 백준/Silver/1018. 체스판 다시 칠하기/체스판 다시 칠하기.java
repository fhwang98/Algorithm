import java.io.*;
import java.util.*;

public class Main {

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
                int w = count(board, i, j, 'W');
                int b = count(board, i, j, 'B');

                min = Math.min(min, Math.min(w, b));
            }
        }

        bw.write(String.valueOf(min));
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }

    private static int count(String[] board, int row, int col, char start) {
        int count = 0;
        char other = start == 'W' ? 'B' : 'W';
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char expected = ((i + j) % 2 == 0) ? start : other;
                if (board[row + i].charAt(col + j) != expected) count++;
            }
        }
        return count;
    }

}