import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
        //윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
        int year = Integer.parseInt(br.readLine());
        int result = 0;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) result = 1;

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }

}