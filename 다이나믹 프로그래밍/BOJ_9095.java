package DynamicProgramming;

import java.io.*;

// 24.03.08
public class BOJ_9095 {
    static int[] cntArr = new int[11];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        cntArr[1] = 1;
        cntArr[2] = 2;
        cntArr[3] = 4;

        for(int j = 4; j < 11; j++) {
            cntArr[j] = cntArr[j-3] + cntArr[j-2] + cntArr[j-1];
        }

        for(int i = 0; i < T; i++) {
            bw.write(cntArr[Integer.parseInt(br.readLine())]+ "\n");
        }

        bw.flush();
        bw.close();
    }

}
