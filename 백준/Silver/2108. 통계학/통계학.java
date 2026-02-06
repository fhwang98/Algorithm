import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0, mode =0, maxCount = 0;
        List<Integer> list = new ArrayList<>();
        int[] count = new int[8001]; // -4000 <=N<= 4000
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            list.add(num);
            count[num + 4000]++;
            maxCount = Math.max(maxCount, count[num + 4000]);
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        // 1. 산술평균 소수점 이하 첫째자리에서 반올림
        sb.append(Math.round((float) sum / N)).append('\n');
        // 2. 중앙값
        Collections.sort(list);
        sb.append(list.get(N / 2)).append('\n');
        // 3. 최빈값, 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값
        boolean isFirst = false;
        for (int i = 0; i < 8001; i++) {
            if (count[i] == maxCount) {
                mode = i - 4000;
                if (!isFirst) {
                    isFirst = true;
                } else {
                    break;
                }
            }
        }
        sb.append(mode).append('\n');
        // 4. 범위
        sb.append(max - min).append('\n');

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
     }

}