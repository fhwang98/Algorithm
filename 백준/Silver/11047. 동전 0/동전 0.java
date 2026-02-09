import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 동전의 종류
        int N = Integer.parseInt(st.nextToken());
        // 만들어야 하는 합
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // K원을 만드는데 필요한 최소 동전 개수
        int count = 0;
        for (int i = arr.length - 1; i >= 0 && K != 0; i--) {
            count += K / arr[i];
            K %= arr[i];
        }

        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
        br.close();
     }
}