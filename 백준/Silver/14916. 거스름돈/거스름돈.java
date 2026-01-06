import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        
        int answer = -1;
        for (int i = n / 5 ; i >= 0; i--){
            if((n - (5 * i)) % 2 == 0){
                answer = i + (n - (5 * i))/2;
                break;
            }
        }
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
