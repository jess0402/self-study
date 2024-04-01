package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24.04.02
public class BOJ_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int startTime = Integer.parseInt(st.nextToken());
        int startMinute = Integer.parseInt(st.nextToken());
        int cookingTime = Integer.parseInt(br.readLine());

        int totalMinute = (startTime * 60) + startMinute + cookingTime;

        int finishTime = totalMinute / 60;
        int finishMinute = totalMinute % 60;
        if(finishTime >= 24) finishTime = finishTime - 24;

        System.out.println(finishTime + " " + finishMinute);
    }
}
