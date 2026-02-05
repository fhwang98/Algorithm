import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // N번째 영화에 들어간 수
        int N = Integer.parseInt(br.readLine());
        int series = 666;
        int count = 1;
        while (count < N) {
            series++;
            if (String.valueOf(series).contains("666")) count++;
        }

        bw.write(String.valueOf(series));
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }
}