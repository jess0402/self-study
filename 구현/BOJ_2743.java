package Implementation;

import java.io.*;

// 24.03.21
public class BOJ_2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        bw.write(str.length() + "");
        bw.flush();
        bw.close();
    }
}
