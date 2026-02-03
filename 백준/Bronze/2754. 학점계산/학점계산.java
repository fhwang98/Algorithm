import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        double result = 0;
        if (line.charAt(0) == 'A') result += 4;
        else if (line.charAt(0) == 'B') result += 3;
        else if (line.charAt(0) == 'C') result += 2;
        else if (line.charAt(0) == 'D') result += 1;

        if (line.charAt(0) != 'F') {
            if (line.charAt(1) == '+') result += 0.3;
            else if (line.charAt(1) == '-') result -= 0.3;
        }

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }

}