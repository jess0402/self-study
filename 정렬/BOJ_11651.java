package Sorting;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//24.03.03
public class BOJ_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] pointArr = new int[N][2];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            pointArr[i][1] = Integer.parseInt(st.nextToken());
            pointArr[i][0] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(pointArr, (o1, o2) -> {
            if(o1[0]==o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        });

        for(int i = 0; i < N; i++) {
            bw.write(pointArr[i][1] + " " + pointArr[i][0] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
