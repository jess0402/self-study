package Implementation;

import java.io.*;
import java.util.StringTokenizer;

// 24.04.26
public class BOJ_10811 {
    static int N, M;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1; // 배열은 0부터 시작하기 떄문에 arr[0]에 1을 넣기 위해 1을 더해줌
        }

        for (int i = 0; i < M; i++) { // M개의 줄
            st = new StringTokenizer(br.readLine(), " ");
            int left = Integer.parseInt(st.nextToken()) - 1; // 배열 0부터 시작
            int right = Integer.parseInt(st.nextToken()) - 1; // 배열 0부터 시작

            while (left < right) {
                int temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }
        br.close();

        for (int baguni:arr)
            System.out.print(baguni + " ");
    }
}
