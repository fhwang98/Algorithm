import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count;

        if (N < 100) {
            count = N;  // 1~99는 모두 한수
        } else {
            count = 99;

            for (int i = 100; i <= N; i++) {
                int a = i / 100;        // 백의 자리
                int b = (i / 10) % 10;  // 십의 자리
                int c = i % 10;         // 일의 자리

                if (a - b == b - c) {
                    count++;
                }
            }
        }

        bw.write(count + "\n");
        
        bw.flush();
        br.close();
        bw.close();
    }
}
