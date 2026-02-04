import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 문자열의 길이
        int N = Integer.parseInt(br.readLine());
        // 문자열
        String line = br.readLine();
        int[] arr = new int[N];
        // 해시값을 정수로 출력
        int result = 0;
        // r = 31, M = 1234567891
        double r = 31;
        int M = 1234567891;
        for (int i = 0; i < N; i++) {
            // 항의 번호에 해당하는 만큼 특정한 숫자를 거듭제곱해서 곱해준 다음 더함
            double num = line.charAt(i) - 'a' + 1;
            num = num * Math.pow(r, (double) i) % M;
            result += num;
        }

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }

}