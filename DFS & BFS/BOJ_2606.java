package DFSBFS;

import java.io.*;
import java.util.StringTokenizer;

// 24.03.22
public class BOJ_2606 {
    static boolean[] check;
    static int[][] arr;
    static int node, line;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());
        arr = new int[node+1][node+1];
        check = new boolean[node+1];

        for(int i = 0; i < line; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        dfs(1);

        bw.write(cnt-1 + "");
        bw.flush();
        bw.close();

    }

    public static void dfs(int start) {
        check[start] = true;
        cnt++;

        for(int i = 0; i <= node; i++) {
            if(arr[start][i] == 1 && !check[i])
                dfs(i);
        }
    }
}
