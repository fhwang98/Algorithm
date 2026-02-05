import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        bw.write("<");
        int index = 0;
        while (!list.isEmpty()) {
            index = (index + K - 1) % list.size();
            bw.write(String.valueOf(list.get(index)));
            if (list.size() > 1) {
                bw.write(", ");
            }
            list.remove(index);
        }
        bw.write(">");

        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }

}