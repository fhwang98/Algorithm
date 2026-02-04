import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); // 낮에 이동
        int B = Integer.parseInt(st.nextToken()); // 밤에 미끄러짐
        int V = Integer.parseInt(st.nextToken()); // 막대의 길이

        int daily = A - B; // 하루에 움직이는 높이
        int target = V - A; // 마지막 날 낮에 오르기 전에 미리 올라가 있어야 할 높이

        int days;
        if (target <= 0) {
            days = 1; // 첫날 낮에 바로 도착
        } else {
            days = (target + daily - 1) / daily + 1; // 올림나눗셈 + 하루(마지막날)
        }

        bw.write(days + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

}