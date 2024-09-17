package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1924 {
    static int x;
    static int y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        int diff = y;
        for(int i = 1; i < x; i++) {
            if(i == 2) {
                diff += 28;
            } else if(i == 4 || i == 6 || i == 9 || i == 11 ) {
                diff += 30;
            } else {
                diff += 31;
            }
        }

        String day =  "";
        switch (diff % 7) {
            case 1 : day = "MON"; break;
            case 2 : day = "TUE"; break;
            case 3 : day = "WED"; break;
            case 4 : day = "THU"; break;
            case 5 : day = "FRI"; break;
            case 6 : day = "SAT"; break;
            case 0 : day = "SUN"; break;
        };

        System.out.print(day);

        br.close();
    }
}
