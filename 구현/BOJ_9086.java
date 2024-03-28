package Implementation;

import java.io.*;

// 24.03.28
public class BOJ_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            bw.write(str.substring(0,1) + str.substring(str.length()-1, str.length()) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
