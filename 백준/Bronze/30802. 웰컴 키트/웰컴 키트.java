import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Long N = Long.parseLong(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long[] sizes = new Long[6];
        for (int i = 0; i < 6; i++) {
            sizes[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        Long T = Long.parseLong(st.nextToken());
        Long P = Long.parseLong(st.nextToken());

        Long countT = 0L;
        for (int i = 0; i < 6; i++) {
            if (sizes[i] == 0) continue;
            countT += (sizes[i] - 1) / T + 1;
        }
        bw.write(countT + "\n");

        Long div = N / P;
        Long mod = N % P;
        bw.write(div + " " + mod + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

}