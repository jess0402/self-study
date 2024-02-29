package Math;

import java.io.*;
import java.util.Arrays;

import static java.lang.Math.round;

// 24.02.29
public class BOJ_18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int r = (int) ((round(n * 0.15) * 100) / 100);
        int[] levelArr = new int[n];

        for(int i = 0; i < n; i++) {
            int level = Integer.parseInt(br.readLine());
            levelArr[i] = level;
        }
        Arrays.sort(levelArr);

        int sum = 0;
        for(int i = r; i < n-r; i++) {
            sum += levelArr[i];
        }

        int result = (int) (round(((double)sum)/(n-(r*2))) * 100) / 100;

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }
}
