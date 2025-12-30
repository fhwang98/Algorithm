import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 소 10마리, (현재위치, 이동횟수)
        int[][] cows = new int[10][2];
        for (int[] row : cows) {
            row[0] = -1;
        }
        for (int i = 0; i < count; i++) {
            // "소번호 관측위치"
            String[] line = br.readLine().split(" ");
            int cow = Integer.parseInt(line[0]) - 1;
            int location = Integer.parseInt(line[1]);

            // 처음 관측된게 아님
            // location과 이전 관측 위치가 다름
            if (cows[cow][0] != -1 && cows[cow][0] != location) {
                cows[cow][1]++;
            }
            cows[cow][0] = location;
        }
        br.close();
        int result = 0;
        for (int[] cow : cows) {
            result += cow[1];
        }
        sb.append(result);
        System.out.println(sb.toString());

    }
}