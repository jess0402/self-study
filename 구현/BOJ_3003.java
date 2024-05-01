package Implementation;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_3003 {
    static int[] arr = new int[] {1, 1, 2, 2, 2, 8};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num, diff;
        for(int i = 0; i < arr.length; i++) {
            num = Integer.parseInt(st.nextToken());
            diff = arr[i] - num;
            bw.write(diff + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
