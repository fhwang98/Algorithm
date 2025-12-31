import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 전구의 개수 + 명령어의 개수
        String[] line = br.readLine().split(" ");

        int[] lights = new int[Integer.parseInt(line[0])];

        String[] status = br.readLine().split(" ");
        for (int i = 0; i < lights.length; i++) {
            lights[i] = Integer.parseInt(status[i]);
        }

        for (int i = 0; i < Integer.parseInt(line[1]); i++) {
            String[] command = br.readLine().split(" ");

            int l = Integer.parseInt(command[1]);
            int r = Integer.parseInt(command[2]);

            switch (command[0]) {
                case "1":
                    lights[l - 1] = r;
                    break;
                case "2":
                    // l부터 r까지 반대로
                    for (int k = l - 1; k < r; k++) {
                        lights[k] = lights[k] == 0 ? 1 : 0;
                    }
                    break;
                case "3":
                    // l부터 r까지 끈다
                    for (int k = l - 1; k < r; k++) {
                        lights[k] = 0;
                    }
                    break;
                case "4":
                    // l부터 r까지 킨다
                    for (int k = l - 1; k < r; k++) {
                        lights[k] = 1;
                    }
                    break;
                default:
                    break;
            }

        }

        for (int i = 0; i < lights.length; i++) {
            sb.append(lights[i]).append(" ");
        }

        br.close();
        System.out.println(sb.toString());

    }
}