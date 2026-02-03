import java.io.*;
import java.time.LocalDate;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        bw.write(String.valueOf(LocalDate.now()));
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }

}