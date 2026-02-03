import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            if (n == 1) continue;
            // 소수 > 1과 자신만 약수
            boolean isPrime = true;
            for (int i = 2; i <= n / i; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) count++;
        }

        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

}