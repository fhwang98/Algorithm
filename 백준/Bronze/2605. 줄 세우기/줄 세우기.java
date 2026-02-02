import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer> answer = new ArrayList<>();
        // 처음 상태 1 2 3 4 5
        for (int i = 0; i < N; i++) {
            answer.add(i + 1);
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            // 0이면 제자리
            // n이면 지금 자리에서 꺼내서 n개 앞으로
            if (num == 0) continue;
            answer.add(i - num, answer.remove(i));
        }
        for (int i = 0; i < N; i++) {
            bw.write(answer.get(i) + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }

}