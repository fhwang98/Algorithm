import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        int[] alpha = new int[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] = -1;
        }
        for (int i = 0; i < line.length(); i++) {
            if (alpha[line.charAt(i) - 'a'] == -1) {
                alpha[line.charAt(i) - 'a'] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            bw.write(String.valueOf(alpha[i]) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }

}