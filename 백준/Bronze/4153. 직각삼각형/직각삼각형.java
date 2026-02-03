import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            if (line.charAt(0) == '0') break;
            // 주어진 세 변의 길이로
            StringTokenizer st = new StringTokenizer(line);
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
                bw.write("right");
            } else {
                bw.write("wrong");
            }
            bw.newLine();

        }

        bw.flush();
        bw.close();
        br.close();
    }

}