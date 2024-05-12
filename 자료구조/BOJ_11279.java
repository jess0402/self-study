package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());

        int x;
        for(int i = 0; i < N; i++) {
            x = Integer.parseInt(br.readLine());
            if(x > 0) {
                maxQueue.add(x);
            } else {
                if(maxQueue.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(maxQueue.poll());
                }
            }
        }
    }
}
