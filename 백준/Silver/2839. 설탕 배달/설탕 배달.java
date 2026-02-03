import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result = -1;
        // 3과 5로 N을 만드는 최소 개수
        // 만들 수 없으면 -1 반환
        for (int i = N / 5; i >= 0; i--) {
            if ((N - i * 5) % 3 == 0) {
                result = i + (N - i * 5) / 3;
                break;
            }
        }

        bw.write(Integer.toString(result));
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }

}