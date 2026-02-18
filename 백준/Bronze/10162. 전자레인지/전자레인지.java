import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T  = Integer.parseInt(br.readLine());
        // 300초, 60초, 10초 로 T 만드는 최소 개수
        // 만들 수 없으면 -1
        int a = T / 300;
        int b = (T - a * 300) / 60;
        int c = (T - a * 300 - b * 60) / 10;

        if (a * 300 + b * 60 + c * 10 != T) {
            bw.write("-1");
        } else {
            bw.write(a + " " + b + " " + c + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }


}
