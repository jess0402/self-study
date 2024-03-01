package BruteForce;

import java.io.*;
import java.util.StringTokenizer;

// 24.03.01
public class BOJ_18111 {
    static int minTime;
    static int groundHeight;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int blockNum = Integer.parseInt(st.nextToken());
        int[][] blockArr = new int[N][M];
        int max = 0;
        int min = 0;

        for(int n = 0; n < N; n++) {
            st = new StringTokenizer(br.readLine());
            for(int m = 0; m < M; m++) {
                blockArr[n][m] = Integer.parseInt(st.nextToken());
                min = Math.min(min, blockArr[n][m]);
                max = Math.max(max, blockArr[n][m]);

            }
        }

        int tmpMinTime = 0;
        int tmpGroundHeight = 0;
        int tmpBlockNum = blockNum;
        int flag = 0;

        for(int height = min; height <= max; height++) {
            tmpGroundHeight = height;
            tmpMinTime = 0;
            tmpBlockNum = blockNum;
            for(int n = 0; n < N; n++) {
                for(int m = 0; m < M; m++) {
                    int thisBlock = blockArr[n][m];
                    if(thisBlock == height) {
                        continue;
                    } else if(thisBlock < height) { // 인벤토리에서 블럭빼오기
                        tmpMinTime += (height - thisBlock);
                        tmpBlockNum -= (height - thisBlock);
                    } else { // 인벤토리에 블럭넣기
                        tmpMinTime += (thisBlock - height) * 2;
                        tmpBlockNum += (thisBlock - height);
                    }
                }
            }

            if(tmpBlockNum > 0 && flag == 0) {
                minTime = tmpMinTime;
                groundHeight = tmpGroundHeight;
                flag = 1;
                continue;
            }

            if(tmpBlockNum >= 0) {
                if(tmpMinTime < minTime) {
                    minTime = tmpMinTime;
                    groundHeight = tmpGroundHeight;
                } else if(tmpMinTime == minTime) {
                    if(tmpGroundHeight > groundHeight) {
                        groundHeight = tmpGroundHeight;
                    }
                }
            }

        }
        bw.write(minTime + " " + groundHeight);
        bw.flush();
        bw.close();
    }
}
