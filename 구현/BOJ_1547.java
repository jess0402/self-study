package Implementation;

import java.io.*;
import java.util.StringTokenizer;

// 24.03.13
public class BOJ_1547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int M = Integer.parseInt(br.readLine());
        int ball = 1;


        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int cup_1 = Integer.parseInt(st.nextToken());
            int cup_2 = Integer.parseInt(st.nextToken());

            if(ball == cup_1) {
                ball = cup_2;
                continue;
            } else if(ball == cup_2) {
                ball = cup_1;
                continue;
            }
        }

        bw.write(ball + "");
        bw.flush();
        bw.close();
    }
}
