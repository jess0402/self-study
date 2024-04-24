package Implementation;

import java.io.*;
import java.util.StringTokenizer;

// 24.04.24
public class BOJ_10810 {
    static int N, M;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());


        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N+1];

        int i, j, k;
        for(int idx = 0; idx < M; idx++) {
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            for(int m = i; m <= j; m++) {
                arr[m] = k;
            }
        }

        for(int num = 1; num < arr.length; num++) {
            bw.write(arr[num] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
