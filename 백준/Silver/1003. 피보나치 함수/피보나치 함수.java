import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1 0
        // 0 1
        // 1 1
        // 1 2
        // 2 3
        // 3 5
        // 5 8

        int T = Integer.parseInt(br.readLine());

        // 0 <= N <= 40
        int[] zero = new int[41];
        int[] one = new int[41];
        zero[0] = 1;
        one[1] = 1;
        for (int i = 2; i < 41; i++) {
            zero[i] = zero[i - 2] + zero[i - 1];
            one[i] = one[i - 2] + one[i - 1];
        }


        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            bw.write(zero[N] + " " + one[N] + "\n");
        }
        

        bw.flush();
        bw.close();
        br.close();
    }
}
