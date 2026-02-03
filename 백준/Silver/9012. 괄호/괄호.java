import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        boolean isVps;
        int open;
        for (int i = 0; i < T; i++) {

            String line = br.readLine();
            isVps = true;
            open = 0;
            // 홀수길이거나 닫는괄호가 먼저 나온다 > 무조건 no
            if (line.length() % 2 == 1 || line.startsWith(")")) {
                isVps = false;
            } else {
                 for (int j = 0; j < line.length(); j++) {
                     char c = line.charAt(j);
                     if (c == '(') {
                         open++;
                     } else if (c == ')' && open > 0) {
                         open--;
                     } else if (c == ')' && open == 0) {
                         isVps = false;
                         break;
                     }

                 }
                 if (open > 0) isVps = false;
            }

            bw.write(isVps ? "YES" : "NO");
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }

}