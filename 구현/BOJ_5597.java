package Implementation;

import java.io.*;
import java.nio.Buffer;

// 24.03.19
public class BOJ_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[31];

        for(int i = 1; i <= 28; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num] = 1;
        }

        boolean flag = false;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == 0) {
                bw.write(i + "\n");
                if(!flag) flag = true;
                else break;
            }
        }

        bw.flush();
        bw.close();
    }
}
