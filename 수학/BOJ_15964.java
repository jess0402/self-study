package Math;

import java.io.*;
import java.util.StringTokenizer;

// 24.03.24
public class BOJ_15964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());

        long answer = (A + B) * (A - B);

        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}
