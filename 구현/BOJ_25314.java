package Implementation;

import java.io.*;

public class BOJ_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int longCnt = N / 4;

        for(int i = 0; i < longCnt; i++) {
             bw.write("long ");
        }
        bw.write("int");
        bw.flush();
        bw.close();
        br.close();
    }
}
