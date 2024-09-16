package Implementation;

import java.io.*;

public class BOJ_2441 {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        for(int n = N; n >= 1; n--){
            for(int i = 0; i < N-n; i++) {
                bw.write(" ");
            }
            for(int i = N; i > N-n; i--) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
