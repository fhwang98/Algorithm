import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String line = br.readLine();
        for (int i = 0; i < croatia.length; i++) {
            if (line.contains(croatia[i])) {
                line = line.replaceAll(croatia[i], ".");
            }
        }
        bw.write(String.valueOf(line.length()));

        bw.flush();
        bw.close();
        br.close();
    }
}
