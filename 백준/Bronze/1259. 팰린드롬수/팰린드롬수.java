import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String s = br.readLine();
            boolean isPalindrome = true;
            if (s.equals("0")) break;
            for (int i = 0; i <= s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) isPalindrome = false;
            }

            bw.write(isPalindrome ? "yes" : "no");
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }

}