package DivideAndConquer;

import java.io.*;

public class BOJ_4779 {
    static int[] stickArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line;
        while((line = br.readLine()) != null) {
            int N = Integer.parseInt(line);
            int size = (int) Math.pow(3, N);
            stickArr = new int[size];

            divide(0, stickArr.length-1, size);

            for(int i = 0; i < size; i++) {
                if(stickArr[i] == 0) sb.append("-");
                else sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
        br.close();

    }

    private static void divide(int start, int end, int size) {
        int newSize = size/3;
        if(size == 1) return;

        int middleStart = start + newSize;
        int middleEnd = end - newSize;

        for(int i = middleStart; i <= middleEnd; i++) {
            stickArr[i] = 1;
        }

        if(newSize == 1) {
            return;
        } else {
            divide(start, start + newSize-1, newSize);
            divide(end - newSize+1, end, newSize);
        }
    }
}
