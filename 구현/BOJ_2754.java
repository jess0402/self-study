package Implementation;

import java.io.*;

// 24.03.27
public class BOJ_2754 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String score = br.readLine();
        double grade = 0;

        char ch = score.charAt(0);
        if(ch == 'A') {
            grade = 4;
        } else if(ch == 'B') {
            grade = 3;
        } else if(ch == 'C') {
            grade = 2;
        } else if(ch == 'D'){
            grade = 1;
        } else {
            bw.write(0.0 + "");
            bw.flush();
            bw.close();

            return;
        }

        ch = score.charAt(1);
        if(ch == '+') {
            grade += 0.3;
        } else if(ch == '-') {
            grade -= 0.3;
        }
        bw.write(grade + "");
        bw.flush();
        bw.close();



    }
}
