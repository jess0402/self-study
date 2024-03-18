package Implementation;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

// 24.03.18
public class BOJ_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int v = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            if(arr[i] == v) cnt++;
        }

        bw.write(cnt + "");
        bw.flush();
        bw.close();

    }
}
