package Math;

import java.io.*;

// 24.03.17
public class BOJ_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int result = 1;
        for(int i = 1; i <= N; i++){
            result *= i;
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}
