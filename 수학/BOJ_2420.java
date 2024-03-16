package Math;

import java.io.*;
import java.util.StringTokenizer;

// 24.03.16
public class BOJ_2420 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Integer.parseInt(st.nextToken());
        long m = Integer.parseInt(st.nextToken());
        long result = Math.abs(n-m);

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}
