import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        int len = 0;
        boolean isValid = true;

        for (int i = 0; i <= line.length(); i++) {
            if (i == line.length() || line.charAt(i) == '.') {
                if (!appendPattern(sb, len)) {
                    isValid = false;
                    break;
                }
                if (i != line.length()) sb.append('.');
                len = 0;
            } else {
                len++;
            }
        }

        bw.write(isValid ? sb.toString() : "-1");
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean appendPattern(StringBuilder sb, int len) {
        if (len == 0) return true;
        if (len % 2 != 0) return false;  // 홀수는 불가능

        int fourCount = len / 4;
        int twoCount = (len % 4) / 2;

        sb.append("AAAA".repeat(fourCount));
        sb.append("BB".repeat(twoCount));

        return true;
    }
}