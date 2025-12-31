import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final String VOWELS = "aeiou";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();
            if (line.equals("end")) break;

            boolean hasVowel = false;
            boolean isAcceptable = true;

            int vowelCnt = 0;
            int consCnt = 0;
            char prev = 0;

            for (char c : line.toCharArray()) {
                boolean isVowel = VOWELS.indexOf(c) >= 0;

                if (isVowel) {
                    hasVowel = true;
                    vowelCnt++;
                    consCnt = 0;
                } else {
                    consCnt++;
                    vowelCnt = 0;
                }

                // 모음 3개 또는 자음 3개 연속
                if (vowelCnt == 3 || consCnt == 3) {
                    isAcceptable = false;
                    break;
                }

                // 같은 문자 연속 (ee, oo 제외)
                if (c == prev && c != 'e' && c != 'o') {
                    isAcceptable = false;
                    break;
                }

                prev = c;
            }

            if (!hasVowel) {
                isAcceptable = false;
            }

            if (isAcceptable) {
                sb.append('<').append(line).append("> is acceptable.\n");
            } else {
                sb.append('<').append(line).append("> is not acceptable.\n");
            }
        }

        System.out.print(sb);
        br.close();
    }
}
