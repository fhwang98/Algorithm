import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int[] dwarf = new int[9];
        for (int i = 0; i < 9; i++) {
            dwarf[i] = Integer.parseInt(br.readLine());
            sum += dwarf[i];
        }

        int target = sum - 100;
        int l = 0, r = dwarf.length - 1;
        Arrays.sort(dwarf);
        while (l < r) {
            if (target == dwarf[l] + dwarf[r]) {
                break;
            } else if (target < dwarf[l] + dwarf[r]) {
                r--;
            } else {
                l++;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (i == l || i == r) continue;
            bw.write(dwarf[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
     }
}