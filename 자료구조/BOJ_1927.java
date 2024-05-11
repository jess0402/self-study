package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int x;
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        for(int i = 0; i < N; i++) {
            x = Integer.parseInt(br.readLine());
            if(x > 0) {
                // 큐에 x라는 값 넣어
                minQueue.add(x);
            } else {
                // 배열에서 가장 작은 값 제거하고 출력해
                if(!minQueue.isEmpty()) {
                    System.out.println(minQueue.poll());
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}
