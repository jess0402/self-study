package DivideAndConquer;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2630 {

    public static int white = 0;
    public static int blue = 0;
    public static int[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        board = new int[N][N];

        StringTokenizer st;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, N);

        bw.write(white + "\n");
        bw.write(blue + "\n");
        bw.flush();
        bw.close();
        br.close();

    }

    public static void partition(int row, int col, int size) {
        if(colorCheck(row, col, size)) {
           if(board[row][col] == 0) white++;
           else blue++;

           return;
        }
        int newSize = size / 2;

        partition(row, col, newSize);
        partition(row, col+newSize, newSize);
        partition(row+newSize, col, newSize);
        partition(row+newSize, col+newSize, newSize);
    }

    public static boolean colorCheck(int row, int col, int size) {
        int color = board[row][col];

        for(int i = row; i < row+size; i++) {
            for(int j = col; j < col+size; j++) {
                if(board[i][j] != color) {
                   return false;
                }
            }
        }

        return true;
    }

}
