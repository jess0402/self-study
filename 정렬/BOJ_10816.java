package Sorting;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_10816 {
    public static int n;
    public static HashMap<Integer, Integer> cardsMap = new HashMap<>();
    public static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer bf = new StringBuffer();

        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
            cardsMap.merge(input, 1, Integer::sum);
        }

        // 숫자 찾기
        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            int thisNum = Integer.parseInt(st.nextToken());
            int thisCnt = cardsMap.get(thisNum) == null ? 0 : cardsMap.get(thisNum);
            bf.append(String.valueOf(thisCnt)).append(" ");
        }

        bw.write(bf.toString());
        bw.flush();
        bw.close();

    }
}
