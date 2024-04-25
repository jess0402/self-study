package Implementation;

import java.io.*;
import java.util.StringTokenizer;

// 24.04.25
public class BOJ_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];

        for(int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        int i, j, tmp;
        for(int idx = 0; idx < M; idx++) {
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());

            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        for(int idx = 1; idx <= N; idx++) {
            bw.write(arr[idx] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
