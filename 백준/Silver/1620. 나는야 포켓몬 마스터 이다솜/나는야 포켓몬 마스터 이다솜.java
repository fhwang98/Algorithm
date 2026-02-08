import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 1 <= N, M <= 100000
        // 포켓몬의 개수
        int N = Integer.parseInt(st.nextToken());
        // 맞춰야하는 문제의 개수
        int M = Integer.parseInt(st.nextToken());

        String[] arr = new String[N + 1];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            arr[i] = br.readLine();
            map.put(arr[i], i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            if (s.matches("[0-9]+")) {
                // 숫자 > 이름 답변
                sb.append(arr[Integer.parseInt(s)]).append("\n");
            } else {
                // 이름 > 숫자 답변
                sb.append(map.get(s)).append("\n");
            }
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
     }

}