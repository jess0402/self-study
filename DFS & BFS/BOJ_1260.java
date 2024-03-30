package DFSBFS;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//24.03.30
public class BOJ_1260 {
    static int[][] graph;
    static boolean[] visit;
    static int N;
    static int M;
    static int V;
    static Queue<Integer> bfsQue;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        bfsQue = new LinkedList<>();
        bfsQue.add(V);

        visit = new boolean[N + 1];
        graph = new int[N + 1][N + 1];

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        DFS(V);
        System.out.println();

        visit = new boolean[N + 1];
        BFS();

    }

    public static void DFS(int start) {
        if(!visit[start]) {
            System.out.print(start + " ");
            visit[start] = true;
            for(int i = 1; i <= N; i++) {
                if(graph[start][i] == 1)
                    DFS(i);
            }
        } else {
            return;
        }
    }

    public static void BFS() {
        int start = bfsQue.poll();
        visit[start] = true;
        System.out.print(start + " ");

        for(int i = 1; i <= N; i++) {
            if(graph[start][i] == 1 && !visit[i]){
                bfsQue.add(i);
                visit[i] = true;
            }
        }

        if(!bfsQue.isEmpty()){
            BFS();
        }
    }
}
