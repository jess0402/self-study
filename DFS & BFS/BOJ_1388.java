package DFSBFS;

import java.io.*;
import java.util.StringTokenizer;

// 24.03.21
public class BOJ_1388 {
    static int N;
    static int M;
    static char[][] floor;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        floor = new char[N][M];

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            for(int j = 0; j < M; j++) {
                char ch = str.charAt(j);
                floor[i][j] = ch;
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                char tile = floor[i][j];
                if(tile == '.') continue;
                else if(tile == '-') {
                    findDash(i, j);
                    cnt++;
                } else if(tile == '|') {
                    findBar(i, j);
                    cnt++;
                }
            }
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }

    static void findDash(int i, int j) {
        if(i >= N || j >= M) return;
        else if(floor[i][j] == '|' || floor[i][j] == '.') return;
        else {
            floor[i][j] = '.';
            findDash(i, j+1);
        }
    }

    static void findBar(int i, int j) {
        if(i >= N || j >= M) return;
        else if(floor[i][j] == '-' || floor[i][j] == '.') return;
        else {
            floor[i][j] = '.';
            findBar(i+1, j);
        }
    }
}
