package Math;

import java.io.*;
import java.util.Arrays;

// 24.03.06
public class BOJ_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        double sum = 0;

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);

        // 1. 산술평균
        int avg;
        avg = (int)(Math.round(((double)sum/N)));
        sb.append(String.valueOf(avg)).append("\n");

        // 2. 중앙값
        sb.append(String.valueOf(arr[N / 2])).append("\n");

        // 3. 최빈값
        boolean flag = false;
        int mode = 10000;
        int mode_max = 0;
        for(int i = 0; i < N; i++) {
            int jump = 0;
            int cnt = 1;
            int i_value = arr[i];
            for(int j = i+1; j < N; j++) {
                if(i_value != arr[j]){
                    break;
                }
                cnt++;
                jump++;
            }

            if(cnt > mode_max) {
                mode_max = cnt;
                mode = i_value;
                flag = true;
            } else if(cnt == mode_max && flag == true) {
                mode = i_value;
                flag = false;
            }

            i += jump;

        }
        sb.append(String.valueOf(mode)).append("\n");

        // 4. 범위
        int range = arr[N-1] - arr[0];
        sb.append(String.valueOf(range)).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
