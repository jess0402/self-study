package DataStructure;

import java.io.*;

// 24.03.03
public class BOJ_10773_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int K = Integer.parseInt(br.readLine());
        int[] numArr = new int[K];
        int idx = -1;

        for(int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                numArr[idx] = 0;
                idx--;
            } else {
                idx++;
                numArr[idx] = num;
            }
        }

        int sum = 0;
        for(int num : numArr) {
            sum += num;
        }

        bw.write(sum + "");
        bw.flush();
        bw.close();

    }
}
